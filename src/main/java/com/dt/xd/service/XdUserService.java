package com.dt.xd.service;

import java.util.List;

import com.dt.xd.xdProduct.XdProduct;
import com.dt.xd.xdUser.XdUser;

public interface XdUserService {
	//运营商的登录
	public List<XdUser> login(String phone);
	
	//运营商的按照id查询
	List<XdUser> selectBy(String id);
	
	//运营商的修改密码
	public int repassword(XdUser user);

	//运营商的注册
	int insert(XdUser record);

	//运营商上传头像
	int updateForOpeImg(XdUser user);
	
	//按照主键查询id
	XdUser selectByPrimaryKey(String id);
}
