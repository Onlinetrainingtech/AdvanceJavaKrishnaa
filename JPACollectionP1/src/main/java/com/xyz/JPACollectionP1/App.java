package com.xyz.JPACollectionP1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentPU");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        
        //create address instances
        
        Address a1=new Address();
        a1.setE_pincode(1234);
        a1.setE_city("Noida");
        a1.setE_state("UP");
        
        Address a2=new Address();
        a2.setE_pincode(1235);
        a2.setE_city("karur");
        a2.setE_state("dgl");
        
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
