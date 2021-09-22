package com.sotra.reservation.repository.bus;

import com.sotra.reservation.model.bus.Agency;
import com.sotra.reservation.model.user.User;
import org.springframework.data.repository.CrudRepository;


public interface AgencyRepository extends CrudRepository<Agency, Long> {
    Agency findByCode(String agencyCode);

    Agency findByOwner(User owner);

    Agency findByName(String name);
}
