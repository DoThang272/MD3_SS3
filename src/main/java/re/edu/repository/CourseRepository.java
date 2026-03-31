package re.edu.repository;

import org.springframework.stereotype.Repository;
import re.edu.model.Course;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    private final List<Course> listCourse = new ArrayList<>();


    public CourseRepository() {
        listCourse.add(new Course(1, "Java Core", "active", 1));
        listCourse.add(new Course(2, "Spring Boot", "inactive", 2));
    }

    public List<Course> findAll(){
        return listCourse;
    }
}
