package com.sto.szdataobject.model;

public class CommonReturnType {

    //表明对应请求的返回处理结果有success 和fail
    private String Status;

    //若status = success则data 返回通用的json书记与
    //若status = fail则 data 返回通用的错误码格式
    private Object Data;

    //定义一个通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }

    public static CommonReturnType create(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setStatus(status);
        return  type;
    }


    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }
}
