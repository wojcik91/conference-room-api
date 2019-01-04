package com.intive.room;

import com.intive.organization.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping("/organizations/{orgId}/rooms")
    public List<Room> getAllRooms(@PathVariable Long orgId) {
        return roomService.getAllRooms(orgId);
    }

    @RequestMapping("/organizations/{orgId}/rooms/{roomId}")
    public Optional<Room> getRoom(@PathVariable Long roomId) {
        return roomService.getRoom(roomId);
    }

    @RequestMapping(value = "/organizations/{orgId}/rooms", method = RequestMethod.POST)
    public void addRoom(@RequestBody Room room, @PathVariable Long orgId) {
        room.setOrganization(new Organization(orgId, ""));
        roomService.addRoom(room);
    }

    @RequestMapping(value = "/organizations/{orgId}/rooms/{roomId}", method = RequestMethod.PUT)
    public void updateRoom(@RequestBody Room room, @PathVariable Long orgId) {
        room.setOrganization(new Organization(orgId, ""));
        roomService.updateRoom(room);
    }

    @RequestMapping(value = "/organizations/{orgId}/rooms/{roomId}", method = RequestMethod.DELETE)
    public void deleteRoom(@PathVariable Long roomId) {
        roomService.deleteRoom(roomId);
    }
}
