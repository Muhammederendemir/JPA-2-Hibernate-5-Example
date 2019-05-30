package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@Data                            //getter setter toString metotlar için
@AllArgsConstructor             //tüm field ile constructor
@NoArgsConstructor
public class BaseEntity {
    @Id
    @GeneratedValue
    protected int id;

    protected String name;

}
