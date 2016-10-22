package com.mycompany.myprod.domain.entities;

import javax.persistence.Entity;

@Entity
public class ProductType extends BaseEntity {
	private String desctiption ;
	private String name ;
	public String getDesctiption() {
		return desctiption;
	}
	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
