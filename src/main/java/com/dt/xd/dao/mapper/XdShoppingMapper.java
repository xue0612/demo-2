package com.dt.xd.dao.mapper;

import com.dt.xd.xdShopping.XdShopping;
import com.dt.xd.xdShopping.XdShoppingExample;
import com.dt.xd.xdShopping.XdShow;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface XdShoppingMapper {
	List<XdShow> selectBoth(String id);
	
	List<XdShow> selectTotal(String id);
	
	List<XdShow> selectProductPrice(String id);
	
	int updateSalesVolume(String id,int count,int newTotal);
	
	long countByExample();

	int getCount(@Param("id") String id);
	
	List<XdShopping> selectByOther();

	List<XdShopping> selectById(XdShoppingExample example);
	
	List<XdShow> selectTwoTable(XdShoppingExample example);

	List<XdShopping> selectByExample(@Param("example") XdShoppingExample example, @Param("id") String id);

	int deleteByExample(XdShoppingExample example);

	int deleteByPrimaryKey(String id);

	int insert(XdShopping record);

	int insertSelective(XdShopping record);

	List<XdShopping> selectByExample(XdShoppingExample example);

	XdShopping selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") XdShopping record, @Param("example") XdShoppingExample example);

	int updateByExample(@Param("record") XdShopping record, @Param("example") XdShoppingExample example);

	int updateByPrimaryKeySelective(XdShopping record);

	int updateByPrimaryKey(XdShopping record);
	
	int updateById(int count,String id);
}