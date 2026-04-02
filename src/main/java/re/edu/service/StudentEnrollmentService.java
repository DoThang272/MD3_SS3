package re.edu.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import re.edu.model.Course;
import re.edu.model.Student;
import re.edu.model.StudentEnrollment;
import re.edu.repository.CourseRepository;
import re.edu.repository.StudentEnrollmentRepository;
import re.edu.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class StudentEnrollmentService {
    private final StudentEnrollmentRepository studentEnrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @Transactional
    public void enrollmentCourse(Long studentId, Long courseId){
        // Tim sinh vien
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Khoong tim thay Sinh vien"));

        //tim khoa hoc
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Khong tim thay khoa hoc"));

        // set cac thong tin bao bang dang ky khoa hoc
        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.setStudent(student);
        studentEnrollment.setCourse(course);

        studentEnrollmentRepository.save(studentEnrollment);
    }
}
