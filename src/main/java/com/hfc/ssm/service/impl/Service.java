package com.hfc.ssm.service.impl;

import java.util.List;

import com.hfc.ssm.po.Items;



public interface Service {
	 List<Items> serItems() throws Exception;
	 void additem(String name,Float price,String detail)throws Exception;
	 void serupdate(Integer id,String name,Float price,String detail) throws Exception;
	 void serdelete(Integer id) throws Exception;
	 void deleteItems(Integer [] chick_id) throws Exception;
	 List<Items> queryItems(Integer[] chick_id) throws Exception;
	 void updateitems(Integer [] chick_id) throws Exception;
	 List<Items> selectbyidItem(Integer id) throws Exception;
}
