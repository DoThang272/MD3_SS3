package re.edu.dto.courses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import re.edu.model.EnumCourse;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseCreateRequest {
    private String title;
    private EnumCourse status;
    private Long instructorId;
}
