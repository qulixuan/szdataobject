package com.sto.szdataobject.model.request;


import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 客户报表实体
 */
@ExcelTarget("CustomerRequest")
public class CustomerRequest extends BaseRowModel implements Serializable {

    /**
     * 序号
     */
    @ExcelProperty(value  = "序号",index = 0)
    private int orderNumber;

    /**
     * 分运单号码
     */
    @ExcelProperty(value = "分运单号码",index = 1)
    private String customsBillCode;

    /**
     * 海关分运单号码
     */
    @ExcelProperty(value = "运单号码",index = 2)
    private String stoBillCode;

    /**
     * 香港申通分运单号
     */
    @ExcelProperty(value = "商品名称",index = 3)
    private String name;

    /**
     * 型号
     */
    @ExcelProperty(value = "商品名称",index = 4)
    private String nameModel;

    /**
     * 件数
     */
    @ExcelProperty(value = "件数",index = 5)
    private int packageNumber;

    /**
     * 数量
     */
    @ExcelProperty(value = "数量",index = 6)
    private String number;

    /**
     * 单位
     */
    @ExcelProperty(value = "单位",index = 7)
    private String unit;

    /**
     * 重量
     */
    @ExcelProperty(value = "重量",index = 8)
    private String weight;

    /**
     * RMB
     */
    @ExcelProperty(value = "价值(RMB)",index = 9)
    private BigDecimal RMB;

    /**
     * 币制
     */
    @ExcelProperty(value = "币制",index = 10)
    private int currencySystem;

    /**
     * 商品编号
     */
    @ExcelProperty(value = "商品编号",index = 11)
    private String itemCode;

    /**
     * 收件人身份证
     */
    @ExcelProperty(value = "收件人身份证",index = 12)
    private String recIDCard;


    /**
     * 收件人地址
     */
    @ExcelProperty(value = "收货人地址",index = 13)
    private String recAddress;

    /**
     * 收件人电话
     */
    @ExcelProperty(value = "收货人电话",index = 14)
    private String recMobile;

    /**
     * 发件人名称
     */
    @ExcelProperty(value = "发件人名称",index = 15)
    private String sendName;

    /**
     * 发货人地址
     */
    @ExcelProperty(value = "发货人地址",index = 16)
    private String sendAddress;

    /**
     * 发货人电话
     */
    @ExcelProperty(value = "发货人电话",index = 17)
    private String sendMobile;

    /**
     * 行邮税
     */
    @ExcelProperty(value = "行邮税",index = 18)
    private double ppat;

    /**
     * 价格链接
     */
    @ExcelProperty(value = "价格链接",index = 19)
    private String priceAddress;


    /**
     * 英文品名
     */
    @ExcelProperty(value = "英文品名",index = 20)
    private String englishProductName;

    /**
     * 城市名
     */
    @ExcelProperty(value = "城市名",index = 21)
    private String city;

    /**
     * 原产国
     */
    @ExcelProperty(value = "原产国",index = 22)
    private BigDecimal fromCountry;

    public BigDecimal getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(BigDecimal fromCountry) {
        this.fromCountry = fromCountry;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomsBillCode() {
        return customsBillCode;
    }

    public void setCustomsBillCode(String customsBillCode) {
        this.customsBillCode = customsBillCode;
    }

    public String getStoBillCode() {
        return stoBillCode;
    }

    public void setStoBillCode(String stoBillCode) {
        this.stoBillCode = stoBillCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public BigDecimal getRMB() {
        return RMB;
    }

    public void setRMB(BigDecimal RMB) {
        this.RMB = RMB;
    }

    public int getCurrencySystem() {
        return currencySystem;
    }

    public void setCurrencySystem(int currencySystem) {
        this.currencySystem = currencySystem;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getRecIDCard() {
        return recIDCard;
    }

    public void setRecIDCard(String recIDCard) {
        this.recIDCard = recIDCard;
    }

    public String getRecAddress() {
        return recAddress;
    }

    public void setRecAddress(String recAddress) {
        this.recAddress = recAddress;
    }

    public String getRecMobile() {
        return recMobile;
    }

    public void setRecMobile(String recMobile) {
        this.recMobile = recMobile;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public String getSendMobile() {
        return sendMobile;
    }

    public void setSendMobile(String sendMobile) {
        this.sendMobile = sendMobile;
    }

    public double getPpat() {
        return ppat;
    }

    public void setPpat(double ppat) {
        this.ppat = ppat;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
