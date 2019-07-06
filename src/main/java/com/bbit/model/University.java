package com.bbit.model;

import javax.persistence.*;

@Entity
@Table(name="University")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Column(name = "University_name")


    private String name;
    private  String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public University(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
