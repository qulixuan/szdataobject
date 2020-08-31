package com.sto.szdataobject.model.request;

import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 香港申通模板
 */
@ExcelTarget("StoDataRequest")
public class StoDataRequest extends BaseRowModel implements Serializable {
    /**
     * 订单号
     */
    @ExcelProperty(value  = "订单号",index = 0)
    private String orderId;

    /**
     * 申通单号
     */
    @ExcelProperty(value  = "申通单号",index = 1)
    private String billCode;


    /**
     * 品牌
     */
    @ExcelProperty(value  = "品牌",index = 2)
    private String brand;

    /**
     * 名称
     */
    @ExcelProperty(value  = "名称",index = 3)
    private String productName;
    /**
     * 数量
     */
    @ExcelProperty(value  = "数量",index = 4)
    private Integer productCount;

    /**
     * 单位
     */
    @ExcelProperty(value  = "单位",index = 5)
    private String units;

    /**
     * 单价
     */
    @ExcelProperty(value  = "单价",index = 6)
    private BigDecimal unitPrice;


    /**
     * 总价
     */
    @ExcelProperty(value  = "总价",index = 7)
    private BigDecimal totalPrice;

    /**
     * 包裹总价值
     */
    @ExcelProperty(value  = "包裹总价值",index = 8)
    private BigDecimal packagePrice;

    /**
     * 称重重量
     */
    @ExcelProperty(value  = "称重重量",index = 9)
    private String weight;


    /**
     * 收费重量
     */
    @ExcelProperty(value  = "收费重量",index = 10)
    private BigDecimal priceWeight;

    /**
     * 备注
     */
    @ExcelProperty(value  = "备注",index = 11)
    private String remake;

    /**
     * 发货人姓名
     */
    @ExcelProperty(value  = "发货人姓名",index = 12)
    private String sendName;

    /**
     * 发货人联系电话
     */
    @ExcelProperty(value  = "发货人联系电话",index = 13)
    private String sendMobile;

    /**
     * 发货人邮箱
     */
    @ExcelProperty(value  = "发货人邮箱",index = 14)
    private String sendMail;

    /**
     * 发货国家
     */
    @ExcelProperty(value  = "发货国家",index = 15)
    private String sendCountry;

    /**
     * 发货省份
     */
    @ExcelProperty(value  = "发货省份",index = 16)
    private String sendProvince;

    /**
     * 发货城市
     */
    @ExcelProperty(value  = "发货城市",index = 17)
    private String sendCity;

    /**
     * 发货区县
     */
    @ExcelProperty(value  = "发货区县",index = 18)
    private String sendArea;

    /**
     * 发货详细地址
     */
    @ExcelProperty(value  = "发货详细地址",index = 19)
    private String sendAddress;

    /**
     * 发货邮编
     */
    @ExcelProperty(value  = "发货邮编",index = 20)
    private String sendZipCode;


    /**
     * 收货人姓名
     */
    @ExcelProperty(value  = "收货人姓名",index = 21)
    private String recName;

    /**
     * 收货人联系电话
     */
    @ExcelProperty(value  = "收货人联系电话",index = 22)
    private String recMobile;

    /**
     * 收货人邮箱
     */
    @ExcelProperty(value  = "收货人邮箱",index = 23)
    private String recEmail;

    /**
     * 收货人证件号码
     */
    @ExcelProperty(value  = "收货人证件号码",index = 24)
    private String recIdCard;

    /**
     * 收货省份
     */
    @ExcelProperty(value  = "收货省份",index = 25)
    private String recProvince;

    /**
     * 收货城市
     */
    @ExcelProperty(value  = "收货城市",index = 26)
    private String recCity;

    /**
     * 收货区县
     */
    @ExcelProperty(value  = "收货区县",index = 27)
    private String recArea;

    /**
     * 收货详细地址
     */
    @ExcelProperty(value  = "收货详细地址",index = 28)
    private String recAddress;



    /**
     * 收货邮编
     */
    @ExcelProperty(value  = "收货邮编",index = 29)
    private String recZipCode;

    /**
     * 包裹状态
     */
    @ExcelProperty(value  = "包裹状态",index = 30)
    private String packageStatus;



//
//    /**
//     * 下单时间
//     */
//    @ExcelProperty(value  = "下单时间",index = 2)
//    private String orderDate;
//
//    /**
//     * 收货国家
//     */
//    @ExcelProperty(value  = "收货国家",index = 3)
//    private String recCountry;
//
//    /**
//     * 产品线路
//     */
//    @ExcelProperty(value  = "产品线路",index = 4)
//    private String productRoute;
//
//    /**
//     * 海外快递公司
//     */
//    @ExcelProperty(value  = "海外快递公司",index = 5)
//    private String haiWaiCompany;
//
//    /**
//     * 海外快递单号
//     */
//    @ExcelProperty(value  = "海外快递单号",index = 6)
//    private String haiWaiBillCode;
//
//    /**
//     * 商城订单号
//     */
//    @ExcelProperty(value  = "商城订单号",index = 7)
//    private String shoppOrderId;
//
//    /**
//     * 会员账号
//     */
//    @ExcelProperty(value  = "会员账号",index = 8)
//    private String member;
//
//    /**
//     * 包裹总数量
//     */
//    @ExcelProperty(value  = "包裹总数量",index = 9)
//    private String packageCount;
//
//
//    /**
//     * 类别
//     */
//    @ExcelProperty(value  = "类别",index = 10)
//    private String category;
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
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

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(BigDecimal packagePrice) {
        this.packagePrice = packagePrice;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public BigDecimal getPriceWeight() {
        return priceWeight;
    }

    public void setPriceWeight(BigDecimal priceWeight) {
        this.priceWeight = priceWeight;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendMobile() {
        return sendMobile;
    }

    public void setSendMobile(String sendMobile) {
        this.sendMobile = sendMobile;
    }

    public String getSendMail() {
        return sendMail;
    }

    public void setSendMail(String sendMail) {
        this.sendMail = sendMail;
    }

    public String getSendCountry() {
        return sendCountry;
    }

    public void setSendCountry(String sendCountry) {
        this.sendCountry = sendCountry;
    }

    public String getSendProvince() {
        return sendProvince;
    }

    public void setSendProvince(String sendProvince) {
        this.sendProvince = sendProvince;
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity;
    }

    public String getSendArea() {
        return sendArea;
    }

    public void setSendArea(String sendArea) {
        this.sendArea = sendArea;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public String getSendZipCode() {
        return sendZipCode;
    }

    public void setSendZipCode(String sendZipCode) {
        this.sendZipCode = sendZipCode;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public String getRecMobile() {
        return recMobile;
    }

    public void setRecMobile(String recMobile) {
        this.recMobile = recMobile;
    }

    public String getRecEmail() {
        return recEmail;
    }

    public void setRecEmail(String recEmail) {
        this.recEmail = recEmail;
    }

    public String getRecIdCard() {
        return recIdCard;
    }

    public void setRecIdCard(String recIdCard) {
        this.recIdCard = recIdCard;
    }

    public String getRecProvince() {
        return recProvince;
    }

    public void setRecProvince(String recProvince) {
        this.recProvince = recProvince;
    }

    public String getRecCity() {
        return recCity;
    }

    public void setRecCity(String recCity) {
        this.recCity = recCity;
    }

    public String getRecArea() {
        return recArea;
    }

    public void setRecArea(String recArea) {
        this.recArea = recArea;
    }

    public String getRecAddress() {
        return recAddress;
    }

    public void setRecAddress(String recAddress) {
        this.recAddress = recAddress;
    }

    public String getRecZipCode() {
        return recZipCode;
    }

    public void setRecZipCode(String recZipCode) {
        this.recZipCode = recZipCode;
    }

    public String getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }
}
