package com.intive.reservation;

import com.intive.room.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @RequestMapping("/organizations/{orgId}/rooms/{roomId}/reservations")
    public List<Reservation> getAllReservations(@PathVariable Long roomId) {
        return reservationService.getAllReservations(roomId);
    }

    @RequestMapping("/organizations/{orgId}/rooms/{roomId}/reservations/{id}")
    public Optional<Reservation> getReservation(@PathVariable Long id) {
        return reservationService.getReservation(id);
    }

    @RequestMapping(value = "/organizations/{orgId}/rooms/{roomId}/reservations", method = RequestMethod.POST)
    public void addReservation(@Valid @RequestBody Reservation reservation, @PathVariable Long roomId) {
        reservation.setRoom(new Room(roomId));
        reservationService.addReservation(reservation);
    }

    @RequestMapping(value = "/organizations/{orgId}/rooms/{roomId}/reservations/{id}", method = RequestMethod.PUT)
    public void updateReservation(@Valid @RequestBody Reservation reservation, @PathVariable Long id, @PathVariable Long roomId) {
        reservation.setId(id);
        reservation.setRoom(new Room(roomId));
        reservationService.updateReservation(reservation);
    }

    @RequestMapping(value = "/organizations/{orgId}/rooms/{roomId}/reservations/{id}", method = RequestMethod.DELETE)
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

}
