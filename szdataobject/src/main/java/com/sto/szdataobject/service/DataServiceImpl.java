package com.sto.szdataobject.service;

import com.alibaba.fastjson.JSONObject;
import com.huaban.analysis.jieba.JiebaSegmenter;
import com.sto.szdataobject.dao.priceDaoMapper;
import com.sto.szdataobject.dao.szCollectDaoMapper;
import com.sto.szdataobject.model.pojo.priceDao;
import com.sto.szdataobject.model.pojo.szCollectDao;
import com.sto.szdataobject.model.request.CustomerRequest;
import com.sto.szdataobject.model.request.SZCollectRequest;
import com.sto.szdataobject.model.request.StoDataRequest;
import com.sto.szdataobject.util.EasyExcelUtil;
import com.sto.szdataobject.util.IKAnalyzerUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.awt.print.Book;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class DataServiceImpl implements DataService {


    @Autowired
    private priceDaoMapper priceDaoMapper;

    @Autowired
    private szCollectDaoMapper szCollectDaoMapper;


    int sum = 0;

    /**
     * 导入客户数据
     *
     * @param file
     * @return
     */
    @Override
    public int importData(MultipartFile file) throws IOException {

        List<szCollectDao> brandList = new ArrayList<>();
        LinkedList productOnlyList = new LinkedList();
        LinkedList productManyList = new LinkedList();
        LinkedList productCountList = new LinkedList();
        List<Object> readExcel = EasyExcelUtil.readExcel(file, new StoDataRequest(), 1, 1);
        if (readExcel != null && readExcel.size() > 0) {
            for (Object item : readExcel) {
                StoDataRequest stoDataRequest = (StoDataRequest) item;
                if (stoDataRequest.getWeight().endsWith("0")) {
                    stoDataRequest.setWeight(stoDataRequest.getWeight().substring(0, stoDataRequest.getWeight().length() - 1));
                }
                if (!StringUtils.isEmpty(stoDataRequest.getBrand())) {
                    try {
                        //通过品牌模糊查询
                        List<szCollectDao> szCollectDaos1 = szCollectDaoMapper.selectInfoByBrand(stoDataRequest.getBrand(),null,null,null,null);
                        if (szCollectDaos1.size() == 1) {
                            //单个直接添加
                            CustomerRequest customerRequest = new CustomerRequest();
                            conventPortEntity((StoDataRequest) item, szCollectDaos1.get(0), customerRequest);
                            productOnlyList.add(customerRequest);
                        } else {
                            HashMap<String,Object> map1 = new HashMap<>();
                            //多个分词
                            JiebaSegmenter jiebaSegmenter = new JiebaSegmenter();
                            List<String> iks = jiebaSegmenter.sentenceProcess(stoDataRequest.getProductName());
                            map1.put("brand",stoDataRequest.getBrand());
                            map1.put("iks",iks);
                            map1.put("number",stoDataRequest.getProductCount().toString());
                            map1.put("nameModel",stoDataRequest.getUnits());
                            map1.put("weight",stoDataRequest.getWeight());
                            List<szCollectDao> szCollectDaos2 = szCollectDaoMapper.selectInfoByIk(map1);
                            if (CollectionUtils.isNotEmpty(szCollectDaos2)){
                                if (szCollectDaos2.size()==1){
                                    CustomerRequest customerRequest = new CustomerRequest();
                                    conventPortEntity((StoDataRequest) item, szCollectDaos1.get(0), customerRequest);
                                    productManyList.add(customerRequest);
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("错误：" + JSONObject.toJSON(item));
                        System.out.println(((StoDataRequest) item).getBrand());
                    }
                }

            }
        }
        productCountList.addAll(productOnlyList);
        productCountList.addAll(productManyList);
        int size = brandList.size();
        int sizes = productCountList.size();
        System.out.println("总的个数：" + sizes);
        return 0;
    }



    private void conventPortEntity(StoDataRequest item, szCollectDao brand, CustomerRequest customerRequest) {
        //分运单号码
        customerRequest.setCustomsBillCode(item.getBillCode());
        //分运单号
        customerRequest.setStoBillCode(brand.getBrand());
        //商品名称
        customerRequest.setName(brand.getProductname());
        //品牌
        customerRequest.setNameModel(brand.getBrand());
        //件数
//        if (!StringUtils.isEmpty(item.getPackageCount())){
//            customerRequest.setPackageNumber(Integer.parseInt(item.getPackageCount()));
//        }
        //数量
        customerRequest.setNumber(item.getProductCount().toString());
        //单位
        //customerRequest.setUnit(brand.getUnit());
        //重量
        if (!StringUtils.isEmpty(item.getWeight())) {
            customerRequest.setWeight(item.getWeight().toString());
        }

        //价值
        customerRequest.setRMB(item.getTotalPrice());
        //币值
        customerRequest.setCurrencySystem(142);
        //商品编号
        customerRequest.setItemCode(brand.getDuty());
        //收件人身份证
        customerRequest.setRecIDCard(item.getRecName() + "(" + item.getRecIdCard() + ")");
        //收货人地址
        customerRequest.setRecAddress(item.getRecAddress());
        //收货人电话
        customerRequest.setRecMobile(item.getRecMobile());
        //发件人名称
        customerRequest.setSendName(item.getSendName());
        //发件人地址
        customerRequest.setSendAddress(item.getSendAddress());
        //发货人电话
        customerRequest.setSendMobile(item.getSendMobile());
        //行邮税
        //价格链接
        customerRequest.setPriceAddress(brand.getPriceaddress());
        //英文品名
        customerRequest.setEnglishProductName(brand.getEnglishproductname());
        //城市名
        customerRequest.setCity(item.getRecCity());
        //原产国
        customerRequest.setFromCountry(new BigDecimal(brand.getFromcountry()));
    }

    /**
     * 导入汇总表数据
     *
     * @param file
     * @return
     */
    @Override
    public int importDataCollect(MultipartFile file) throws IOException {
        List<Object> readExcel = EasyExcelUtil.readExcel(file, new SZCollectRequest(), 1, 1);
        if (readExcel != null && readExcel.size() > 0) {
            for (Object item : readExcel) {
                szCollectDao szCollectDao = conventCollectDao((SZCollectRequest) item);
                if (szCollectDao != null) {
                    try {
                        int insert = szCollectDaoMapper.insert(szCollectDao);
                    } catch (Exception e) {
                        System.out.println(JSONObject.toJSON(szCollectDao));
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public szCollectDao conventCollectDao(SZCollectRequest request) {
        if (request != null) {
            szCollectDao collectDao = new szCollectDao();
            collectDao.setId(UUID.randomUUID().toString().replace("-", ""));
            collectDao.setBrand(request.getBrand());
            collectDao.setProductname(request.getProductName());
            collectDao.setEnglishproductname(request.getEnglishProductName());
            collectDao.setNamemodel(request.getNameModel());
            collectDao.setUnit(request.getUnit().toString());
            collectDao.setNumber(request.getNumber().toString());
            collectDao.setWeight(request.getWeight());
            collectDao.setDuty(request.getDuty().toString());
            collectDao.setFromcountry(request.getFromCountry().toString());
            collectDao.setPriceaddress(request.getPriceAddress());
            return collectDao;
        }
        return null;
    }

    /**
     * READ_COMMITTED
     *
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT)
    public int increasePrice() {
        priceDao price = new priceDao();
        price.setName("屈立轩");
        priceDao priceDao = priceDaoMapper.selectInfo(price);

        price.setName("屈立轩");
        price.setPrice(String.valueOf((Integer.parseInt(priceDao.getPrice()) + 1)));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int insert = priceDaoMapper.updateByPrimaryKey(price);
        sum = sum + insert;
        System.out.println("个数:" + sum);
        return 1;
    }
}
