package com.sotra.reservation.repository.bus;

import com.sotra.reservation.model.bus.Stop;
import org.springframework.data.repository.CrudRepository;

public interface StopRepository extends CrudRepository<Stop, Long> {
    Stop findByCode(String code);
}
