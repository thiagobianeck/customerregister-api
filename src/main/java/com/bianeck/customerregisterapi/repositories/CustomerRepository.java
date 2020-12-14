package com.bianeck.customerregisterapi.repositories;

import com.bianeck.customerregisterapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
