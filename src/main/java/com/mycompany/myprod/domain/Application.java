package com.mycompany.myprod.domain;



import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.mycompany.myprod.domain.entities.Provider;
import com.mycompany.myprod.domain.entities.Color;
import com.mycompany.myprod.domain.entities.Product;


/**
 * @author hheravan
 *
 */
public class Application {

	public static void main(String[] args) {
   		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("infinite-finances");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx =  em.getTransaction();

		tx.begin();
		Provider brand = new Provider();
		brand.setName("Colombia");
		brand.setCreatedAt(new Date());
		brand.setCreatedBy("Hheravan");
		brand.setUpdatedAt(new Date());
		brand.setUpdatedBy("Hheravan");
		em.persist(brand);

		Color color = new Color();
		color.setName("RED");
		color.setCreatedAt(new Date());
		color.setCreatedBy("Hheravan");
		color.setUpdatedAt(new Date());
		color.setUpdatedBy("Hheravan");
		em.persist(color);
		
		Product prod = new Product();
		prod.setCode("10001");
		prod.setTitle("Over Coat");
		prod.setUnitCost(250.00f);
		prod.setDescription("Long Sliver over Coat");
		prod.setCreatedAt(new Date());
		prod.setCreatedBy("Hheravan");
		prod.setUpdatedAt(new Date());
		prod.setUpdatedBy("Hheravan");
		em.persist(prod);
		StoredProcedureQuery query = em.createStoredProcedureQuery("calculate");
		query.registerStoredProcedureParameter("x"   , Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("y"   , Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("sum" , Double.class, ParameterMode.OUT);
		
		query.setParameter("x", 1.23d);
		query.setParameter("y", 4.56d);

		// call the stored procedure and get the result
		query.execute();
		Double sum = (Double) query.getOutputParameterValue("sum");
		System.out.println("sum       :" +sum);

		
		tx.commit();
		
		em.close();
		emf.close();
	}
}
		
/*		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
*/		
/*		Brand brand = new Brand();
		brand.setId(1L);
		brand.setName("Colombia");
		brand.setCreatedAt(new Date(0));
		brand.setCreatedBy("Hheravan");
		brand.setUpdatedAt(new Date(0));
		brand.setUpdatedBy("Hheravan");
		
		session.save(brand);
		
		session.getTransaction().commit();
		session.close();*/
