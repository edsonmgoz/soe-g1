package main.soe.api.app.rest.controllers;

import main.soe.api.data.entities.PaymentEntity;
import main.soe.api.data.entities.StudentEntity;
import main.soe.api.domain.services.StudentService;

//@RequestMapping("/student")
public class StudentController {

    //@Autowired
    private StudentService studentService;

    //@GetMapping
    public StudentEntity account(StudentEntity student) {
        return studentService.account(student);
    }

    //@GetMapping
    public PaymentEntity paymentPlan(StudentEntity student) {
        return studentService.paymentPlan(student);
    }

    //@GetMapping
    public StudentEntity profile(StudentEntity student) {
        return studentService.profile(student);
    }

    // @PostMapping
    public StudentEntity add() {
        return studentService.add();
    }
}
