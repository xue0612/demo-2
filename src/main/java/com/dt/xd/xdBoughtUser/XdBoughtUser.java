package com.dt.xd.xdBoughtUser;

import java.util.Date;

public class XdBoughtUser {
    private String id;

    private String userName;

    private String headImg;

    private String sex;

    private String phone;

    private String area;

    private Date ts;

    private String email;

    private Integer boughtNum;

    private Float total;

    private String status;

    private String password;
    
    private String cmbProvince;

    private String cmbCity;
    
    private String cmbArea;

    public String getCmbProvince() {
		return cmbProvince;
	}

	public void setCmbProvince(String cmbProvince) {
		this.cmbProvince = cmbProvince;
	}

	public String getCmbCity() {
		return cmbCity;
	}

	public void setCmbCity(String cmbCity) {
		this.cmbCity = cmbCity;
	}

	public String getCmbArea() {
		return cmbArea;
	}

	public void setCmbArea(String cmbArea) {
		this.cmbArea = cmbArea;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getBoughtNum() {
        return boughtNum;
    }

    public void setBoughtNum(Integer boughtNum) {
        this.boughtNum = boughtNum;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}