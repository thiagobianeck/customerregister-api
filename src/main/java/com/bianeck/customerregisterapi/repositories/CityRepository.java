package com.bianeck.customerregisterapi.repositories;

import com.bianeck.customerregisterapi.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
