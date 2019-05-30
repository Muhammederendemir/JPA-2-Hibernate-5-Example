package com.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "NEW_CUSTOMER_Table")
@SecondaryTable(name = "CUSTOMER_DETAILS")
public class Customer implements Serializable {

    private int id;
    private String name;
    private String address;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(table = "CUSTOMER_DETAILS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
