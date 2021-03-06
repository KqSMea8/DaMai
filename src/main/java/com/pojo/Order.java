package com.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单实体类
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 3741358553926792249L;
    private Integer id;//订单id(主键)
    private String number;//订单编号
    private Integer mode;//配送方式(1.为电子票,2.快递票)
    private Integer num;//票数
    private Double price;//票价(演出门票单价)
    private Double transport;//运费
    private Double discount;//优惠价格(使用优惠券优惠了多少钱)
    private Integer status;//交易状态,0:交易关闭,1:待付款,2:已付款

//    private Integer user_id;//用户id(外键)
//    private Integer show_id;//演出id(外键)
//    private Integer address_id;//收货地址id(外键)

    private User user;//用户集合
    private Tshow tshow;//商品集合
    private Taddress taddress;//地址集合

    private Date createDate;//创建时间
    private Date deliveryDate;//发货时间
    private String address;//收货地址

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tshow getTshow() {
        return tshow;
    }

    public void setTshow(Tshow tshow) {
        this.tshow = tshow;
    }

    public Taddress getTaddress() {
        return taddress;
    }

    public void setTaddress(Taddress taddress) {
        this.taddress = taddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTransport() {
        return transport;
    }

    public void setTransport(Double transport) {
        this.transport = transport;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

//    public Integer getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(Integer user_id) {
//        this.user_id = user_id;
//    }
//
//    public Integer getShow_id() {
//        return show_id;
//    }
//
//    public void setShow_id(Integer show_id) {
//        this.show_id = show_id;
//    }
//
//    public Integer getAddress_id() {
//        return address_id;
//    }
//
//    public void setAddress_id(Integer address_id) {
//        this.address_id = address_id;
//    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
