package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data                            //getter setter toString metotlar için
@AllArgsConstructor             //tüm field ile constructor
@NoArgsConstructor
public class Lesson extends BaseEntity {

    @ManyToMany(mappedBy = "lessons")
    private List<Student> students;

}