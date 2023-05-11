package com.ahia.ecommerceProject.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    //CREATE
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    //READ
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    //UPDATE

    //DELETE
    public void deleteRole(Integer role_id) {
        roleRepository.deleteById(role_id);
    }
}
