package com.entity;


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
public class Student extends BaseEntity {

    @ManyToMany
    private List<Lesson> lessons;


}
