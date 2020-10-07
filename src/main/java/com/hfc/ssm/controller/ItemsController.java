package com.hfc.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.hfc.ssm.po.Items;
import com.hfc.ssm.service.impl.Service;
import com.mchange.v2.csv.MalformedCsvException;

@Controller
public class ItemsController {
	
	@Autowired
	Service service;
	
	@RequestMapping("/SelectServlet.do")
	public	ModelAndView getall()throws Exception {
			ModelAndView modelAndView=new ModelAndView();
			System.out.println("进入的是查询所有数据的方法");
			List<Items> list=service.serItems();
			for (Items myUser : list) {
				System.out.println(myUser.getName());
				modelAndView.addObject("selist", list);
		modelAndView.setViewName("userlist");
			}
			
	
		return modelAndView;
			
		}
	
	@RequestMapping("/add.do")
	public ModelAndView additem(String name,String price,String detail) throws Exception {
		// TODO  Auto-generated method stub
		service.additem(name, Float.valueOf(price), detail);
		return getall();

	}
	@RequestMapping("/del.do")
	public ModelAndView delItems(String id) throws Exception {
		service.serdelete(Integer.valueOf(id));
		// TODO Auto-generated method stub
		return getall();
	}
	
	
	@RequestMapping("/edit.do")
	public	ModelAndView fallidMyuser(String id) throws NumberFormatException, Exception {
		ModelAndView modelAndView=new ModelAndView();
		 List<Items> list= service.selectbyidItem(Integer.valueOf(id));
		 modelAndView.addObject("list", list);
		 modelAndView.setViewName("selectpatch");
		return  modelAndView;
	}
		@RequestMapping("/secondedit.do")
		public ModelAndView secondedit(String id,String name,String price,String detail) throws Exception {
			System.out.println(id+name+price+detail);
			service.serupdate(Integer.valueOf(id),name, Float.valueOf(price),detail);
			
			return getall();
		}
	
	
	@RequestMapping("/deleteItems.do")
	public ModelAndView deleteItems(Integer[] chick_id) throws Exception {
		for (Integer integer : chick_id) {
			System.out.println(integer);
		}
		
		service.deleteItems(chick_id);
		return getall();
	}
	
	
	
	@RequestMapping("/queryItems.do")
	public ModelAndView queryItems(Integer [] chick_id) throws Exception {
		for (Integer integer : chick_id) {
			
			System.out.println(integer);
		}
		List<Items> list=service.queryItems(chick_id);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("selectpatch");
		
		
		return modelAndView;
		
		
	}
	
	
	@RequestMapping("/queryItemspacth.do")
	public ModelAndView queryItemspacth(Integer [] chick_id) throws Exception {
		for (Integer integer : chick_id) {
			System.out.println(integer);
		}
		
		service.updateitems(chick_id);
		
		return getall();
		
	}
	
	

	

}
