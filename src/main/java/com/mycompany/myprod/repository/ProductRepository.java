package com.mycompany.myprod.repository;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myprod.domain.entities.Product;

@Repository
public class ProductRepository {
	@PersistenceContext
	private EntityManager entityManager;

		@Autowired
		private ProductJpaRepository productJpaRepository;
		/**
		 * Find
		 */
		public Product find(Long id) {
			return productJpaRepository.findOne(id);
		}
		//@Query("select product from Product p where product.code = :code")
		public Product getProductByCode( String code) {
			Product product = (Product)entityManager
					.createQuery("select product from Product pwhere product.code = :code")
					.setParameter("code", code ).getSingleResult();
			return product ;
		}
}
