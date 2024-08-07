package com.xyz.JPARelationShipOnetoOne;

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
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Collection_Type");
         EntityManager em=emf.createEntityManager();
         
         em.getTransaction().begin();
         
         Student student=new Student();
         student.setName("mohmaed");
         
         LibraryCard libraryCard=new LibraryCard();
         libraryCard.setCardNumber("LC1234");
         
         student.setLibraryCard(libraryCard);
         libraryCard.setStudent(student);
         
         em.persist(student);
         
         em.getTransaction().commit();
         
         //Fetching the student details
         
         Student fetchedstudent=em.find(Student.class,student.getId());
         
         System.out.println("StudentName::"+fetchedstudent.getName());
         
         System.out.println("CardName::"+fetchedstudent.getLibraryCard());
         
         em.close();
         emf.close();
    }
}
