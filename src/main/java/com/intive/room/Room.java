package com.intive.room;

import com.intive.organization.Organization;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class Room {

    @Id @GeneratedValue
    private long id;
    @Size(min = 2, max = 20)
    private String name;
    @Size(min = 2, max = 20)
    private String description;
    private Integer floor;
    private Boolean available;
    private Integer seated;
    private Integer standing;

    @ManyToOne
    private Organization organization;

    public Room() {

    }

    public Room(long id, @Size(min = 2, max = 20) String name, @Size(min = 2, max = 20) String description, Integer floor, Boolean available, Integer seated, Integer standing, Organization organization) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.floor = floor;
        this.available = available;
        this.seated = seated;
        this.standing = standing;
        this.organization = organization;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFloor() {
        return floor;
    }


    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getSeated() {
        return seated;
    }

    public void setSeated(Integer seated) {
        this.seated = seated;
    }

    public Integer getStanding() {
        return standing;
    }

    public void setStanding(Integer standing) {
        this.standing = standing;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
