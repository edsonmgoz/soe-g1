package main.soe.api.app.rest.controllers;

import main.soe.api.data.entities.GroupEntity;
import main.soe.api.domain.services.GroupService;
import java.util.List;

//@RequestMapping("/group")
public class GroupController {

    // @Autowired
    private GroupService groupService;

    // @GetMapping
    public List<GroupEntity> allGroups() {
        return groupService.allGroups();
    }

    // @PostMapping
    public GroupEntity add() {
        return groupService.add();
    }

    // @PostMapping
    public GroupEntity addIntoGroup() {
        return groupService.addIntoGroup();
    }
}
