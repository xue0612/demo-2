package com.dt.xd.dao.mapper;

import com.dt.xd.xdBoughtUser.XdBoughtUser;
import com.dt.xd.xdBoughtUser.XdBoughtUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface XdBoughtUserMapper {

	int updateBy(String password1, String phone);
	
	int updateByExample();

	long countByExample();
	
	int getCount(@Param("userName") String userName);
	
	List<XdBoughtUser> selectByUserName(XdBoughtUserExample example);

	int deleteByExample(XdBoughtUserExample example);

	int deleteByPrimaryKey(String id);

	int insert(XdBoughtUser record);

	int insertSelective(XdBoughtUser record);

	List<XdBoughtUser> selectByExample(XdBoughtUserExample example);

	XdBoughtUser selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") XdBoughtUser record, @Param("example") XdBoughtUserExample example);

	int updateByPrimaryKeySelective(XdBoughtUser record);

	int updateByPrimaryKey(XdBoughtUser record);
}