package restfulapi.task.vetclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restfulapi.task.vetclinic.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
