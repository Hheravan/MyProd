package com.mycompany.myprod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.myprod.domain.entities.Product;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product,Long> {
	public Product getProductByCode( String code) ;
}
