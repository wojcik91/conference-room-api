package com.intive.reservation;

import com.intive.room.Room;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Reservation {

    @Id
    @GeneratedValue
    private long id;
    @Size(min = 2, max = 20)
    private String employee;
    private Date start;
    private Date end;

    @ManyToOne
    private Room room;

    public Reservation() {

    }

    public Reservation(long id, @Size(min = 2, max = 20) String employee, Date start, Date end, Room room) {
        this.id = id;
        this.employee = employee;
        this.start = start;
        this.end = end;
        this.room = room;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
