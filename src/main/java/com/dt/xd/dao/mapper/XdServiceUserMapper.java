package com.dt.xd.dao.mapper;

import com.dt.xd.xdServiceUser.XdServiceUser;
import com.dt.xd.xdServiceUser.XdServiceUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface XdServiceUserMapper {
	int updateBy(String servicePassword1, String servicePhone);

	long countByExample();

	int getCount(@Param("serviceName") String serviceName);

	List<XdServiceUser> selectByName(XdServiceUserExample example);

	int deleteByExample(XdServiceUserExample example);

	int deleteByPrimaryKey(String id);

	int insert(XdServiceUser record);

	int insertSelective(XdServiceUser record);

	List<XdServiceUser> selectByExample(XdServiceUserExample example);

	List<XdServiceUser> selectByPhone(String phone);

	List<XdServiceUser> select();

	XdServiceUser selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") XdServiceUser record, @Param("example") XdServiceUserExample example);

	int updateByExample(@Param("record") XdServiceUser record, @Param("example") XdServiceUserExample example);

	int updateByPrimaryKeySelective(XdServiceUser record);

	int updateByPrimaryKey(XdServiceUser record);

	int updateForImg(XdServiceUser record);

	int updateForStore(XdServiceUser record);

	int updateForSetting(XdServiceUser record);

	int updateStore(XdServiceUser record);

	int updateForStatus(XdServiceUser user);
}