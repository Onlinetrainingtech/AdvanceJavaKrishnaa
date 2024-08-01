package com.xyz.JPACollectionSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xyz.JPACollectionSet.Address;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Collection_Type");
         EntityManager em=emf.createEntityManager();
         em.getTransaction().begin();
         
         //creating address instances
         Address a1=new Address();
         a1.setE_pincode(123456);
         a1.setE_city("karur");
         a1.setE_state("krr");
         
         Address a2=new Address();
         a2.setE_pincode(234545);
         a2.setE_city("dgl");
         a2.setE_state("dddd");
         
         
         //Creating Employee instance
         
         Employee f1=new Employee();
         f1.setE_id(1);
         f1.setE_name("azar");
         f1.getAddress().add(a1);
         
         Employee f2=new Employee();
         f2.setE_id(2);
         f2.setE_name("mohamed");
         f2.getAddress().add(a2);
         
         
         //Using merge insted of persist
         
         em.merge(f1);
         em.merge(f2);
         
         em.getTransaction().commit();
         
         em.close();
         emf.close();
         
    }
}
