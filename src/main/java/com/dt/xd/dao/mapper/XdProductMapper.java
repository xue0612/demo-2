package com.dt.xd.dao.mapper;

import com.dt.xd.xdProduct.XdProduct;
import com.dt.xd.xdProduct.XdProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface XdProductMapper {
	long countByExample();

	int getCount(@Param("productName") String productName);

	List<XdProduct> selectByName(XdProductExample example);

	List<XdProduct> selectByExample(@Param("example") XdProductExample example, @Param("productName") String productName);

    int deleteByExample(XdProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XdProduct record);

    int insertSelective(XdProduct record);

    List<XdProduct> selectByExampleWithBLOBs(XdProductExample example);

    List<XdProduct> selectByExample(XdProductExample example);

    XdProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XdProduct record, @Param("example") XdProductExample example);

    int updateByExampleWithBLOBs(@Param("record") XdProduct record, @Param("example") XdProductExample example);

    int updateByExample(@Param("record") XdProduct record, @Param("example") XdProductExample example);

    int updateByPrimaryKeySelective(XdProduct record);

    int updateByPrimaryKeyWithBLOBs(XdProduct record);

    int updateByPrimaryKey(XdProduct record);
    
    int updateByStatus(XdProduct record);
    
    int updateForService(XdProduct user);
}