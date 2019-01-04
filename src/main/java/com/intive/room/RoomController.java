package com.intive.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping("/organizations/{orgId}/rooms")
    public List<Room> getAllRooms() {

    }

    @RequestMapping("/organizations/{orgId}/rooms/{roomId}")
    public Room getRoom() {

    }

    @RequestMapping(value = "/organizations/{orgId}/rooms", method = RequestMethod.POST)
    public void addRoom() {

    }

    @RequestMapping(value = "/organizations/{orgId}/rooms/{roomId}", method = RequestMethod.PUT)
    public void updateRoom() {

    }

    @RequestMapping(value = "/organizations/{orgId}/rooms/{roomId}", method = RequestMethod.DELETE)
    public void deleteRoom() {

    }
}
