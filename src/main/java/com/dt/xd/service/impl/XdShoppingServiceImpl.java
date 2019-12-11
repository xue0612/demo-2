package com.dt.xd.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.dt.xd.dao.mapper.XdShoppingMapper;
import com.dt.xd.service.XdShoppingService;
import com.dt.xd.xdBoughtUser.XdBoughtUserExample;
import com.dt.xd.xdShopping.XdShopping;
import com.dt.xd.xdShopping.XdShoppingExample;
import com.dt.xd.xdShopping.XdShow;

@Service
public class XdShoppingServiceImpl implements XdShoppingService{
	@Resource
	XdShoppingMapper xdShoppingMapper;
	
	@Override
	//以map为参数的模糊查询，这里没有用到
	public List<XdShopping> selectByExample(int pageStart, int pageSize, String id) {
		XdShoppingExample xdShoppingExample=new XdShoppingExample();
		xdShoppingExample.setDistinct(true);
		xdShoppingExample.setPageSize(pageSize);
		xdShoppingExample.setPageStart(pageStart);
		return xdShoppingMapper.selectByExample(xdShoppingExample, id);
	}

	@Override
	//获取数据库记录总数
	public long getCount() {
		XdShoppingExample xdShoppingExample=new XdShoppingExample();
		return xdShoppingMapper.countByExample();
	}

	@Override
	//获取总数
	public int getCount(String id) {
		return xdShoppingMapper.getCount(id);
	}

	@Override
	//按照id查询
	public List<XdShopping> selectById(int pageStart, int pageSize, String id) {
		XdShoppingExample xdShoppingExample=new XdShoppingExample();
		xdShoppingExample.setId(id);
		xdShoppingExample.setPageSize(pageSize);
		xdShoppingExample.setPageStart(pageStart);
		return xdShoppingMapper.selectById(xdShoppingExample);
	}

	@Override
	//按照主键删除
	public int deleteByPrimaryKey(String id) {
		
		return xdShoppingMapper.deleteByPrimaryKey(id);
	}

//	@Override
//	public List<XdShopping> getSystemUserById(String id) {
//		XdShoppingExample xdShoppingExample=new XdShoppingExample();
//		XdShoppingExample.Criteria criteria=xdShoppingExample.createCriteria();
//		criteria.andIdEqualTo(id);
//		return null;
//	}

	@Override
	//加入购物车，向页面中插入记录
	public int insertShopping(XdShopping user) {
		return xdShoppingMapper.insert(user);
	}

	@Override
	//按照例子查询
	public List<XdShopping> selectAll() {
		return xdShoppingMapper.selectByExample(null);
	}

//	@Override
//	public List<XdShopping> selectByOther() {
//		return xdShoppingMapper.selectByOther();
//	}

	@Override
	//将两个表的列都放在一起，页面上显示分页和查询，这里显示的是按照id查询，但是修改了sql语句，这里是按照产品名称查询
	public List<XdShow> selectTwoTable(int pageStart, int pageSize, String id) {
		XdShoppingExample xdShoppingExample=new XdShoppingExample();
		xdShoppingExample.setId(id);
		xdShoppingExample.setPageSize(pageSize);
		xdShoppingExample.setPageStart(pageStart);
		return xdShoppingMapper.selectTwoTable(xdShoppingExample);
	}

	@Override
	public List<XdShow> selectTotal(String id) {
		return xdShoppingMapper.selectTotal(id);
	}

	@Override
	//查询两个表中的元素，按照产品名称查询
	public List<XdShow> selectBoth(String id) {
		return xdShoppingMapper.selectBoth(id);
	}

	@Override
	public int updateShopping(HttpServletRequest request) {
		return xdShoppingMapper.updateById(Integer.parseInt(request.getParameter("num")), request.getParameter("id"));
	}

	@Override
	public int updateShoppingNum(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return 0;
	}



}
