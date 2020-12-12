package com.bianeck.customerregisterapi.repositories;

import com.bianeck.customerregisterapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
