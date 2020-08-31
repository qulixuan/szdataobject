package com.sto.szdataobject.model.request;

import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

/**
 * 深圳汇总数据实体
 * @Auther: 屈立轩
 * @Date: 2020-05-16 15:02
 */
@ExcelTarget("SZCollectRequest")
public class SZCollectRequest extends BaseRowModel implements Serializable {

    /**
     * 品名
     */
    @ExcelProperty(value  = "品名",index = 0)
    private String productName;

    /**
     * 英文品名
     */
    @ExcelProperty(value = "英文品名",index = 1)
    private String englishProductName;

    /**
     * 品牌
     */
    @ExcelProperty(value  = "品牌",index = 2)
    private String brand;

    /**
     * 型号
     */
    @ExcelProperty(value = "型号",index = 3)
    private String nameModel;

    /**
     * 数量
     */
    @ExcelProperty(value = "数量",index = 4)
    private Integer number;

    /**
     * 单位
     */
    @ExcelProperty(value = "单位",index = 5)
    private String unit;



    /**
     * 重量
     */
    @ExcelProperty(value = "重量",index = 6)
    private String weight;

    /**
     * 币制
     */
    @ExcelProperty(value = "币制",index = 7)
    private Integer bizhi;

    /**
     * 税号
     */
    @ExcelProperty(value  = "税号",index = 8)
    private Integer duty;

    /**
     * 生产国别
     */
    @ExcelProperty(value = "生产国别",index = 9)
    private Integer fromCountry;


    /**
     * 价格链接
     */
    @ExcelProperty(value = "价格链接",index = 10)
    private String priceAddress;


    /**
     * 全品名
     */
    @ExcelProperty(value = "全品名",index = 11)
    private String allProductName;


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }





    public Integer getBizhi() {
        return bizhi;
    }

    public void setBizhi(Integer bizhi) {
        this.bizhi = bizhi;
    }

    public Integer getDuty() {
        return duty;
    }

    public void setDuty(Integer duty) {
        this.duty = duty;
    }

    public Integer getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(Integer fromCountry) {
        this.fromCountry = fromCountry;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }





    public String getAllProductName() {
        return allProductName;
    }

    public void setAllProductName(String allProductName) {
        this.allProductName = allProductName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getPriceAddress() {
        return priceAddress;
    }

    public void setPriceAddress(String priceAddress) {
        this.priceAddress = priceAddress;
    }

    public String getEnglishProductName() {
        return englishProductName;
    }

    public void setEnglishProductName(String englishProductName) {
        this.englishProductName = englishProductName;
    }
}
