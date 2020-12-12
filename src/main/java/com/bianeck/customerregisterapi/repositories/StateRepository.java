package com.bianeck.customerregisterapi.repositories;

import com.bianeck.customerregisterapi.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
