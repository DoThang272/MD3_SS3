package re.edu.repository;

import org.springframework.stereotype.Repository;
import re.edu.model.Course;
import re.edu.model.Enrollment;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnrollmentRepository {
    private final List<Enrollment> enrollments = new ArrayList<>();

    public EnrollmentRepository() {
        enrollments.add(new Enrollment(1, "Thang", 1));
        enrollments.add(new Enrollment(2, "Quyet", 2));
    }

    public List<Enrollment> findAll(){
        return enrollments;
    }
}
