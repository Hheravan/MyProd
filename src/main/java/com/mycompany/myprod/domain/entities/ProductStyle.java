package com.mycompany.myprod.domain.entities;

import javax.persistence.Entity;

@Entity
public class ProductStyle extends BaseEntity {

	private String name ;
	private String description ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
