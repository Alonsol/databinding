package com.alonsol.databindingdemo;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Goods extends BaseObservable {

    //如果是public修饰符，则可以直接在成员变量上方加上@Bindable注解
    @Bindable
    public String name;

    //如果是private修饰符，则在成员变量的get方法上添加@Bindable注解
    private String details;

    private float price;

    public Goods(String name, String details, float price) {
        this.name = name;
        this.details = details;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
        //只更新此字段
        notifyPropertyChanged(com.alonsol.databindingdemo.BR.name);
    }

    @Bindable
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
        //更新所有字段
        notifyChange();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
