package com.dt.xd.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

//import javax.servlet.http.HttpServletRequest;

import com.dt.xd.xdShopping.XdShopping;
import com.dt.xd.xdShopping.XdShow;

public interface XdShoppingService {
	//以map为参数的模糊查询，但是这里没有用到
	List<XdShopping> selectByExample(int pageStart, int pageSize, String id);

	//获取页面的记录
	public long getCount();

	int getCount(String id);

	//按id查询，xd_shopping表上的记录
	List<XdShopping> selectById(int pageStart, int pageSize, String id);
	
	//两表连接，查询两个表上的记录
	List<XdShow> selectTwoTable(int pageStart, int pageSize, String id);
	
	//计算总价
	List<XdShow> selectTotal(String id);
	
	//购物车表上的删除
	int deleteByPrimaryKey(String id);
	
	//List<XdShopping> getSystemUserById(String id);
	
	//购物车表的加入购物车，将产品表里的主键id添加给购物车表里的外键pro_id
	int insertShopping(XdShopping user);
	
	//调用shopping表的selectByExample
	List<XdShopping> selectAll();
	
	//List<XdShopping> selectByOther();
	
	//一起查询两个表的元素，按照产品名称查询
	List<XdShow> selectBoth(String id);
	
	//加入购物车
	int updateShopping(HttpServletRequest request);
	
	int updateShoppingNum(HttpServletRequest request);
}
