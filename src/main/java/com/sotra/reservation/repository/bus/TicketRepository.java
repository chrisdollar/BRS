package com.sotra.reservation.repository.bus;

import com.sotra.reservation.model.bus.Ticket;
import org.springframework.data.repository.CrudRepository;


public interface TicketRepository extends CrudRepository<Ticket, Long> {
}