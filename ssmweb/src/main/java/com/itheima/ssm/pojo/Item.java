package com.itheima.ssm.pojo;

import java.util.Date;

/**
 * @PackageName: com.itheima.ssm.pojo
 * @ClassName: Item
 * @Author: caibing
 * @Date: 2020/5/11 14:47
 * @Description:
 */

public class Item {
    private int id;
    private String name;
    private float price;
    private Date createtime;
    private String detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
