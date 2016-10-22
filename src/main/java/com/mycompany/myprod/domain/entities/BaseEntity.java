package com.mycompany.myprod.domain.entities;


import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
	// ======================================
	  // =             Attributes             =
	  // ======================================

	 private Long id;
	  private String createdBy;
	  private Date createdAt;
	  private String updatedBy;
	  private Date UpdatedAt;
	  
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name="ID",nullable=false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
   @Column(name="CREATED_BY",length = 50, nullable = false)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	  
	  @Column(name="CREATED_AT", nullable = false)

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name ="UPDATED_BY" , length = 50)
	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	  @Column(name="UPDATED_AT")

	public Date getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}
}
