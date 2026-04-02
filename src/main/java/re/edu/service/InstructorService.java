package re.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import re.edu.dto.InstructorCreateRequest;
import re.edu.model.Instructor;
import re.edu.repository.InstructorRepository;

import java.util.List;

@Service
public class InstructorService {
    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public Instructor findInstructorById(Long id){
        return instructorRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy giảng viên"));
    }

    public List<Instructor> finAllInstructor(){
        return instructorRepository.findAll();
    }

    public Instructor createInstructor(InstructorCreateRequest req){
        Instructor instructor = new Instructor();
        instructor.setName(req.getName());
        instructor.setEmail(req.getEmail());

        return instructorRepository.save(instructor);
    }
}
