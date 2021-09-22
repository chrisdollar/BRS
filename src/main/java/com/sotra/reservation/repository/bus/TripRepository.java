package com.sotra.reservation.repository.bus;

import com.sotra.reservation.model.bus.Agency;
import com.sotra.reservation.model.bus.Bus;
import com.sotra.reservation.model.bus.Stop;
import com.sotra.reservation.model.bus.Trip;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepository extends CrudRepository<Trip, Long> {
    Trip findBySourceStopAndDestStopAndBus(Stop source, Stop destination, Bus bus);
    List<Trip> findAllBySourceStopAndDestStop(Stop source, Stop destination);
    List<Trip> findByAgency(Agency agency);
}

