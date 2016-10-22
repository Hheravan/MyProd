/**
 * 
 */
package com.mycompany.myprod.domain.entities;

import javax.persistence.Column;
/**
 * @author hheravan
 *
 */
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity

@Table(name = "T_PROVIDER")
public class Provider extends BaseEntity{
	private String name ;
	@Column(name="NAME", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
