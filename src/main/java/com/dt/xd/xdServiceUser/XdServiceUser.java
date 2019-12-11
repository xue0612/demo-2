package com.dt.xd.xdServiceUser;

import java.util.Date;

public class XdServiceUser {
    private String id;

    private String serviceHead;

    private String serviceName;

    private String area;

    private String servicePhone;

    private String servicePassword;

    private String introduction;

    private String status;

    private String email;

    private Date ts;

    private String synopsis;

    private String worktime;

    private String qq;

    private String wechat;

    private String customPhone;

    private String license;
    
    private byte[] img;
    
    private String cmbProvince;

    private String cmbCity;
    
    private String cmbArea;
    
    private byte[] lic;

    public byte[] getLic() {
		return lic;
	}

	public void setLic(byte[] lic) {
		this.lic = lic;
	}

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

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getServiceHead() {
        return serviceHead;
    }

    public void setServiceHead(String serviceHead) {
        this.serviceHead = serviceHead == null ? null : serviceHead.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public String getServicePassword() {
        return servicePassword;
    }

    public void setServicePassword(String servicePassword) {
        this.servicePassword = servicePassword == null ? null : servicePassword.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis == null ? null : synopsis.trim();
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime == null ? null : worktime.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getCustomPhone() {
        return customPhone;
    }

    public void setCustomPhone(String customPhone) {
        this.customPhone = customPhone == null ? null : customPhone.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }
}