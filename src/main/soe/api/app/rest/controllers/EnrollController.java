package main.soe.api.app.rest.controllers;

import main.soe.api.domain.services.EnrollService;
import main.soe.api.data.entities.StudentEntity;
import main.soe.api.data.entities.TeacherEntity;

import java.util.List;

//@RequestMapping("/enroll")
public class EnrollController {

    //@Autowired
    private EnrollService enrollService;

    //@GetMapping
    public List<StudentEntity> listStudentsByTeacher(TeacherEntity teacher) {
        return enrollService.listStudentsByTeacher(teacher);
    }

    //@PostMapping
    public Object sendEmailToStudent(StudentEntity student) {
        return enrollService.sendEmailToStudent(student);
    }
}
