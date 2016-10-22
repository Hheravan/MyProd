package com.mycompany.myprod.domain.entities;

import javax.persistence.Entity;

@Entity
public class Size extends BaseEntity {

	private String title ;
	
	private Float hight ;
	
	private Float width ;
	
	private Float length ;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getHight() {
		return hight;
	}

	public void setHight(Float hight) {
		this.hight = hight;
	}

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	
	
	
}
