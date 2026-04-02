package re.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.model.StudentEnrollment;


public interface EnrollmentRepository extends JpaRepository<StudentEnrollment, Long> {
}
