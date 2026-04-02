package re.edu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import re.edu.dto.courses.CourseCreateRequest;
import re.edu.dto.courses.CourseUpdateRequest;
import re.edu.model.Course;
import re.edu.model.Instructor;
import re.edu.repository.CourseRepository;
import re.edu.repository.InstructorRepository;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository, InstructorRepository instructorRepository) {
        this.courseRepository = courseRepository;
        this.instructorRepository = instructorRepository;
    }

    public Course createCourse(CourseCreateRequest req){
        // Tim giange viên trước
        Instructor instructor = instructorRepository.findById(req.getInstructorId()).orElseThrow(() -> new RuntimeException("Không tmf thấy giảng viên"));
        //Neu co giangr vien thi them vao khoa hoc
        Course course = new Course();
        course.setTitle(req.getTitle());
        course.setStatus(req.getStatus());
        course.setInstructor(instructor);
        return courseRepository.save(course);
    }

    private Course updateCourseById(Long id, CourseUpdateRequest req){
        //Kiem tra khoa hoc ton tai
        Course  course = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("KHong tim thay khoa hoc"));

        // Tim giang vien
        Instructor instructor = instructorRepository.findById(req.getInstructorId()).orElseThrow(() -> new RuntimeException("KHoong tim thay giang vien"));

        course.setTitle(req.getTitle());
        course.setStatus(req.getStatus());
        course.setInstructor(instructor);

        return courseRepository.save(course);
    }



}
