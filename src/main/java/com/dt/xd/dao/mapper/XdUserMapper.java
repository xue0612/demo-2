package com.dt.xd.dao.mapper;

import com.dt.xd.xdUser.XdUser;
import com.dt.xd.xdUser.XdUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface XdUserMapper {
    long countByExample(XdUserExample example);

    int deleteByExample(XdUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(XdUser record);

    int insertSelective(XdUser record);

    List<XdUser> selectByExample(XdUserExample example);

    XdUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XdUser record, @Param("example") XdUserExample example);

    int updateByExample(@Param("record") XdUser record, @Param("example") XdUserExample example);

    int updateByPrimaryKeySelective(XdUser record);
    
    int updateBy(String password1,String phone);

    int updateByPrimaryKey(XdUser record);
    
    int updateForOpeImg(XdUser record);
}