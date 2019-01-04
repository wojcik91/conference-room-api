package com.intive.reservation;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

    public List<Reservation> findByRoomId(Long roomId);
}
