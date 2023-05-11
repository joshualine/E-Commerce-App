package com.ahia.ecommerceProject.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    RoleService roleService;

    //CREATE ROLE CONTROLLER METHOD
    @RequestMapping(value = "/roles", method = RequestMethod.POST)
    public Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }

    // GET ALL ROLES CONTROLLER METHOD
    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<Role> readRoles() {
        return roleService.getRoles();
    }

    @RequestMapping(value = "/roles/{role_id}", method = RequestMethod.DELETE)
    public void deleteRoles(@PathVariable(value = "role_id") Integer id) {
        roleService.deleteRole(id);
    }

}
