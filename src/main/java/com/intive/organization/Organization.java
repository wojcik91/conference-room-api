package com.intive.organization;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Organization {

    @Id @GeneratedValue
    private long id;
    @Size(min = 2, max = 20, message = "Organization name must be between 2 and 20 characters")
    private String name;

    public Organization() {

    }

    public Organization(long id, @Size(min = 2, max = 20) String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
