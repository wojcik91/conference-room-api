package com.intive.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    public List<Room> getAllRooms() {

    }

    public Room getRoom() {

    }

    public void addRoom() {

    }

    public void updateRoom() {

    }

    public void deleteRoom() {

    }
}
