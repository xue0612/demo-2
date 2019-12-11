package com.dt.xd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dt.xd.dao.mapper.XdProductMapper;
import com.dt.xd.dao.mapper.XdUserMapper;
import com.dt.xd.service.XdUserService;
import com.dt.xd.xdProduct.XdProduct;
import com.dt.xd.xdProduct.XdProductExample;
import com.dt.xd.xdUser.XdUser;
import com.dt.xd.xdUser.XdUserExample;

@Service
public class XdUserServiceImpl implements XdUserService{
	@Resource
	XdUserMapper xdUserMapper;
	@Resource
	XdProductMapper xdProductMapper;
	
	@Override
	//运营商的登录，调用匿名内部类，调用查询
	public List<XdUser> login(String phone) {
		XdUserExample xdUserExample=new XdUserExample();
		XdUserExample.Criteria criteria=xdUserExample.createCriteria();
		criteria.andPhoneEqualTo(phone);
		return xdUserMapper.selectByExample(xdUserExample);
	}
	@Override
	//运营商的修改密码，调用.xml文件里的updateBy，修改了.xml文件
	public int repassword(XdUser user) {
		XdUserExample xdUserExample=new XdUserExample();
		XdUserExample.Criteria criteria=xdUserExample.createCriteria();
		return xdUserMapper.updateBy(user.getPassword(), user.getPhone());
	}
	@Override
	//运营商的的注册
	public int insert(XdUser record) {
		return xdUserMapper.insert(record);
	}
	
	@Override
	//运营商的按照主键id查询
	public List<XdUser> selectBy(String id) {
		XdUserExample xdUserExample=new XdUserExample();
		XdUserExample.Criteria criteria=xdUserExample.createCriteria();
		criteria.andIdEqualTo(id);
		return xdUserMapper.selectByExample(xdUserExample);
	}
	@Override
	public int updateForOpeImg(XdUser user) {
		return xdUserMapper.updateForOpeImg(user);
	}
	@Override
	public XdUser selectByPrimaryKey(String id) {
		return xdUserMapper.selectByPrimaryKey(id);
	}
}
