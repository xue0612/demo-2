package com.dt.xd.xdProduct;

import java.util.Date;

public class XdProduct {
    private Integer id;

    private String serviceProduct;

    private String productName;

    private String productInstruction;

    private Float productPrice;

    private String status;

    private Date ts;

    private Integer salesVolume;

    private String serviceName;

    private String recommend;

    private String highQuality;

    private String username;

    private byte[] img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceProduct() {
        return serviceProduct;
    }

    public void setServiceProduct(String serviceProduct) {
        this.serviceProduct = serviceProduct == null ? null : serviceProduct.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductInstruction() {
        return productInstruction;
    }

    public void setProductInstruction(String productInstruction) {
        this.productInstruction = productInstruction == null ? null : productInstruction.trim();
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }

    public String getHighQuality() {
        return highQuality;
    }

    public void setHighQuality(String highQuality) {
        this.highQuality = highQuality == null ? null : highQuality.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}