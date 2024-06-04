package com.hutech.kt_b5.Controller;

import com.hutech.kt_b5.Entities.Role;
import com.hutech.kt_b5.Services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleServices roleServices;
    @GetMapping("")
    public String getRole(Model model) {
        List<Role> roles = roleServices.getAllRoles();
        model.addAttribute("roles", roles);
        return "Role/getAll";
    }

    @GetMapping("/new")
    public String AddRole(Model model) {
        model.addAttribute("roles", new Role());
        return "Role/add";
    }

    @PostMapping("/save")
    public String saveRole(Role role) {
        roleServices.addRole(role);
        return "redirect:/roles";
    }
}
