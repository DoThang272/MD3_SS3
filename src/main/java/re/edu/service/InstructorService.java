package re.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    public List<Instructor> findAll(){
        return instructorRepository.findAll();
    }
}
