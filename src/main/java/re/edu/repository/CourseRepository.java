package re.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
