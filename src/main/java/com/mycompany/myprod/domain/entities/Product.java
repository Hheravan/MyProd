package com.mycompany.myprod.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product extends BaseEntity {
	
	private String title ;
	
	private String code ;
	
	private String description ;
	
	private String Comment ;

	private Float unitCost;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROD_TYPE_FK")
	private ProductType prodType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIZE_FK")
	private ProductType Size;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROVIDER_FK")
	private ProductType Povider;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COLOR_FK")
	private ProductType Color;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_FK")
	private ProductType Category;
	
	@Column(name="TITLE", nullable = false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name="CODE", nullable = false)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Column(name="DESCRIPTION", nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="COMMENT")
	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	@Column(name="UNIT_COST", nullable = false )
	public Float getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Float unitCost) {
		this.unitCost = unitCost;
	}

}
