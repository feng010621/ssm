package com.hfc.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hfc.ssm.po.Items;


public interface ItemsMapper {
	
	List<Items> selectAll()throws Exception;
	List<Items> selectByid(Integer id);
	void add(@Param("name")String name,@Param("price")Float price,@Param("detail")String detail) throws Exception;
	void update(@Param("id")Integer id,@Param("name")String name,@Param("price")Float price,@Param("detail")String detail) throws Exception;
	void delete(Integer id) throws Exception;
	void deleteItems(Integer [] chick_id) throws Exception;
	List<Items> queryItems(Integer [] chick_id) throws Exception;
	
	void updateItems(Integer [] chick_id) throws Exception;
}
