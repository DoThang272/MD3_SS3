package re.edu.dto.courses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import re.edu.model.EnumCourse;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CourseUpdateRequest {
    private String title;
    private EnumCourse status;
    private Long instructorId;

}
