/**
 * 
 */
package com.mycompany.myprod.domain.entities;

import java.sql.Date;

import javax.persistence.Entity;

/**
 * @author hheravan
 *
 */
@Entity
public class ProductDiscounts extends BaseEntity {

	private Long    product_fk ;
	private String  discountType ;
	private Integer discountPercent;
	private Float 	discountAmount ;
	private Date    startDate;
	private Date    endDate ;
	public Long getProduct_fk() {
		return product_fk;
	}
	public void setProduct_fk(Long product_fk) {
		this.product_fk = product_fk;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public Integer getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(Integer discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Float getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(Float discountAmount) {
		this.discountAmount = discountAmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
