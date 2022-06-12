package main.soe.api.app.rest.controllers;

import main.soe.api.domain.services.ReportService;
import java.util.List;

//@RequestMapping("/reports")
public class ReportController {

    // @Autowired
    private ReportService reportService;

    // @GetMapping
    public List<Object> studentsByProgramAndGroup() {
        return reportService.studentsByProgramAndGroup();
    }

    // @GetMapping
    public List<Object> paymentsByProgramAndGroup() {
        return reportService.paymentsByProgramAndGroup();
    }

    // @GetMapping
    public List<Object> studentsByProgram() {
        return reportService.studentsByProgram();
    }

    // @GetMapping
    public List<Object> studentsByTeacher() {
        return reportService.studentsByTeacher();
    }
}
