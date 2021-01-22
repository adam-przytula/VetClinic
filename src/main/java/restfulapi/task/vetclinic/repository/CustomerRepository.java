package restfulapi.task.vetclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restfulapi.task.vetclinic.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
