package re.edu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import re.edu.dto.ApiResponse;
import re.edu.dto.InstructorCreateRequest;
import re.edu.model.Course;
import re.edu.service.InstructorService;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AppController {


    private final InstructorService instructorService;

    @PostMapping("/instructors")
    public ResponseEntity<ApiResponse<Void>> createInstructor(@RequestBody InstructorCreateRequest req){
        instructorService.createInstructor(req);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.<Void>builder().code(201).massage("Them moi giang vien thanh cong").build()
        );
    }

}
