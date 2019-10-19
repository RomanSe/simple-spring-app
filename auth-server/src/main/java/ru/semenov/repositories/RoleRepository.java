package ru.semenov.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.semenov.entities.Role;

@Repository
public interface RoleRepository  extends CrudRepository<Role, Long> {
}
