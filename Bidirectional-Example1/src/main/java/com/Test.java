package com;

import com.entity.Lesson;
import com.entity.Student;
import com.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = new Student();
        student.setName("Muhammed");

        Student student1 = new Student();
        student1.setName("Eren");


        Lesson Lesson = new Lesson();
        Lesson.setName("Algoritma");
        Lesson.setStudents(Arrays.asList(student, student));

        Lesson Lesson1 = new Lesson();
        Lesson.setName("Java");
        Lesson.setStudents(Arrays.asList(student, student1));


        student.setLessons(Arrays.asList(Lesson, Lesson1));
        student1.setLessons(Arrays.asList(Lesson));

      /*   System.out.println(entityB);
        System.out.println(entityB2);
        System.out.println(entityA);
        System.out.println(entityA2);
         */
        //entityManager.getTransaction().begin();
        entityManager.persist(Lesson);
        entityManager.persist(Lesson1);
        entityManager.persist(student);
        entityManager.persist(student1);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
