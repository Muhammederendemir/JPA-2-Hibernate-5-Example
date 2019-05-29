package com;

import com.model.Student;
import com.util.JPAUtil;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;


public class App {
    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        //İnsert islemi yapılıyor

        Student student = new Student("Muhammed", "Demir", "mhmmderen3@gmail.com");
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();


        //guncelleme islemleri
//guncelleme yapmak istenildigi zaman torumsatırları kaldırılıp insert islemi yorum satırına alınır
        /*
          Student student1 = entityManager.find(Student.class,1);
          student1.setName("eren");
          entityManager.clear();

          entityManager.merge(student1);
          entityManager.getTransaction().commit();
          entityManager.close();
        */


        //silme islemleri
        //BURADA BI SORUN VAR DÜZELTİLECEK SORUN İSE Student classımın  FARKLI PAKETTE BULUNMASI

     /*   Student student1 = entityManager.find(Student.class,1); entityManager.clear();
        System.out.println(student1);

        entityManager.remove(student1);
        entityManager.getTransaction().commit();
        entityManager.close();
        */

      /*  // Check database version
        String sql = "select version()";

        String result = (String) entityManager.createNativeQuery(sql).getSingleResult();
        System.out.println(result);

        entityManager.getTransaction().commit();
        entityManager.close();
     */
        JPAUtil.shutdown();
    }
}