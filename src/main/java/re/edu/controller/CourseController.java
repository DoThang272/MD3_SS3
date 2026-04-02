//package re.edu.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import re.edu.model.Course;
//import re.edu.service.CourseService;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/v1/courses")
//@RequiredArgsConstructor
//public class CourseController {
////    private final CourseService courseService;
////
////
////    @GetMapping
////    public Map<String, Object> getAll(){
////        Map<String, Object> map = new HashMap<>();
////        map.put("data", courseService.findAll());
////        map.put("code", 200);
////        return map;
////    }
////
////    @GetMapping("/{id}")
////    public ResponseEntity<?> getById(@PathVariable int id){
////        Course course = courseService.findById(id);
////        if (course == null){
////            return ResponseEntity.notFound().build();
////        }
////        return new ResponseEntity<>(course, HttpStatus.OK);
////    }
////
////    @PostMapping
////    public ResponseEntity<Course> create(@RequestBody Course course){
////        Course created = courseService.addNewCourse(course);
////        return ResponseEntity.status(201).body(created);
////    }
//}
