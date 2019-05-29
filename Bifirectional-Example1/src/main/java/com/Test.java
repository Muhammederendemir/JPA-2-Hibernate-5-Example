package com;

import com.entity.Lessos;
import com.entity.Student;
import com.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student=new Student();
        student.setName("Muhammed");

        Student student1=new Student();
        student1.setName("Eren");


        Lessos lessos=new Lessos();
        lessos.setName("Algoritma");
        lessos.setStudents(Arrays.asList(student,student));

        Lessos lessos1=new Lessos();
        lessos.setName("Java");
        lessos.setStudents(Arrays.asList(student,student1));



        student.setLessons(Arrays.asList(lessos,lessos1));
        student1.setLessons(Arrays.asList(lessos));

      /*   System.out.println(entityB);
        System.out.println(entityB2);
        System.out.println(entityA);
        System.out.println(entityA2);
         */
        //entityManager.getTransaction().begin();
        entityManager.persist(lessos);
        entityManager.persist(lessos1);
        entityManager.persist(student);
        entityManager.persist(student1);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
