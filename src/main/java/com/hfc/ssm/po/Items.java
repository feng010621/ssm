package com.hfc.ssm.po;

import java.util.Date;

public class Items {
	
	private Integer id;
	private String name;
	private  Float price;
	private  String detail;
	private  Byte[] pic;
	private  Date createtime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Byte[] getPic() {
		return pic;
	}
	public void setPic(Byte[] pic) {
		this.pic = pic;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	
	}