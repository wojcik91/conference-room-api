package com.intive.room;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {

    @Id
    private String id;
    private String name;
    private Integer floor;
    private Boolean available;
    private Integer seated;
    private Integer standing;

    public Room() {

    }

    public Room(String id, String name, Integer floor, Boolean available, Integer seated, Integer standing) {
        this.id = id;
        this.name = name;
        this.floor = floor;
        this.available = available;
        this.seated = seated;
        this.standing = standing;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
