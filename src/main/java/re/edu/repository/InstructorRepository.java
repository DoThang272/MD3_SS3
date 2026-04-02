package re.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
