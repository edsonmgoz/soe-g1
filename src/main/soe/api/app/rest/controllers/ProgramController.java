package main.soe.api.app.rest.controllers;

import main.soe.api.data.entities.ProgramEntity;
import main.soe.api.domain.services.ProgramService;
import java.util.List;

//@RequestMapping("/program")
public class ProgramController {

    // @Autowired
    private ProgramService programService;

    // @GetMapping
    public List<ProgramEntity> allPrograms() {
        return programService.allPrograms();
    }

    // @PostMapping
    public ProgramEntity add() {
        return programService.add();
    }
}
