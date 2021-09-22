package com.sotra.reservation.repository.bus;

import com.sotra.reservation.model.bus.Agency;
import com.sotra.reservation.model.bus.Bus;
import org.springframework.data.repository.CrudRepository;


public interface BusRepository extends CrudRepository<Bus, Long> {
    Bus findByCode(String busCode);
    Bus findByCodeAndAgency(String busCode, Agency agency);
}
