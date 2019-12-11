package com.dt.xd.dao.mapper;

import com.dt.xd.xdOrder.XdOrder;
import com.dt.xd.xdOrder.XdOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface XdOrderMapper {
    long countByExample();
    
    int getCount(@Param("orderNumber") String orderNumber);
    
    List<XdOrder> selectByNumber(XdOrderExample example);
    
    List<XdOrder> selectByDate(String startdate, String enddate);

    int deleteByExample(XdOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(XdOrder record);

    int insertSelective(XdOrder record);

    List<XdOrder> selectByExample(XdOrderExample example);

    XdOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XdOrder record, @Param("example") XdOrderExample example);

    int updateByExample();

    int updateByPrimaryKeySelective(XdOrder record);

    int updateByPrimaryKey(XdOrder record);
}