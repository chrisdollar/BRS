package com.sotra.reservation.repository.bus;

import com.sotra.reservation.model.bus.Trip;
import com.sotra.reservation.model.bus.TripSchedule;
import org.springframework.data.repository.CrudRepository;


public interface TripScheduleRepository extends CrudRepository<TripSchedule, Long> {
    TripSchedule findByTripDetailAndTripDate(Trip tripDetail, String tripDate);
}
