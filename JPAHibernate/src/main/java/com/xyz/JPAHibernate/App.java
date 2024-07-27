package com.xyz.JPAHibernate;

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
       
       /*StudentEntity s1=new StudentEntity();
       s1.setS_id(1001);
       s1.setS_name("mohamed");
       s1.setS_age(24);
       
       em.persist(s1);*/
       
       
      /* StudentEntity s1=new StudentEntity();
       s1.setS_id(1002);
       s1.setS_name("azar");
       s1.setS_age(24);
       
       em.persist(s1);*/
       
       StudentEntity s=em.find(StudentEntity.class,1002);
       
       System.out.println("StudentId::"+s.getS_id());
       
       System.out.println("StudentName::"+s.getS_name());
       
       System.out.println("StudentAge is::"+s.getS_age());
       
       //em.remove(s);
       
       s.setS_age(200);
       

       em.getTransaction().commit();
       
       emf.close();
       
       System.out.println("Data is Inserted..");
       
    }
}
