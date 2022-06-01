package com.devops.lab.db.tables.repositories;

import com.devops.lab.db.tables.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
