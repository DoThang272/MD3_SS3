package re.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.model.StudentEnrollment;

public interface StudentEnrollmentRepository extends JpaRepository<StudentEnrollment, Long> {
}
