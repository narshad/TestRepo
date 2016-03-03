package com.example.model;

/**
 * Created by narshad on 02/03/16.
 */
public class Customer {
    private Long id;
    private String name;

    public Customer() {

    }

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
