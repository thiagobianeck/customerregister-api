package com.bianeck.customerregisterapi.repositories;

import com.bianeck.customerregisterapi.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
