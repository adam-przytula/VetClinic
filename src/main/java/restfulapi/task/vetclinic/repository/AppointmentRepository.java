package restfulapi.task.vetclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restfulapi.task.vetclinic.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
