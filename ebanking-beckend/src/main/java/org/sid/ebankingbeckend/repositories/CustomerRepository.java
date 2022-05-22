package org.sid.ebankingbeckend.repositories;

import org.sid.ebankingbeckend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>  {
}
