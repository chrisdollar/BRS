package com.sotra.reservation.repository.user;

import com.sotra.reservation.model.user.Role;
import com.sotra.reservation.model.user.UserRoles;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(UserRoles role);

}