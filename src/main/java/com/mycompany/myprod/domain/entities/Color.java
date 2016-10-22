package com.mycompany.myprod.domain.entities;


import javax.persistence.*;


@Entity
public class Color extends BaseEntity {
	
private String name ;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
