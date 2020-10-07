package com.hfc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.hfc.ssm.mapper.ItemsMapper;
import com.hfc.ssm.po.Items;

public class ServiceImpl implements Service{
	

	@Autowired
	ItemsMapper itemsMapper;

	@Override
	public List<Items> serItems() throws Exception {
		// TODO Auto-generated method stub
		return itemsMapper.selectAll();
	}

	@Override
	public void deleteItems(Integer[] chick_id) throws Exception {
		itemsMapper.deleteItems(chick_id);
	
		
	}

	@Override
	public List<Items> queryItems(Integer[] chick_id) throws Exception {
		// TODO Auto-generated method stub
		return itemsMapper.queryItems(chick_id);
	}

	@Override
	public void updateitems(Integer[] chick_id) throws Exception {
		// TODO Auto-generated method stub
		itemsMapper.updateItems(chick_id);
	}
	public void serupdate( Integer id,String name,Float price,String detail) throws Exception {
		itemsMapper.update(id,name,price,detail);
	}

	public void serdelete(Integer id) throws Exception {
		// TODO Auto-generated method stu
		itemsMapper.delete(id);
		
	}

	@Override
	public List<Items> selectbyidItem(Integer id) throws Exception {
		return itemsMapper.selectByid(id);
	}

	@Override
	public void additem(String name, Float price, String detail) throws Exception {
		// TODO Auto-generated method stub
		itemsMapper.add(name, price, detail);
	}
	
}
