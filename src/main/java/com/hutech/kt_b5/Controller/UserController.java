package com.hutech.kt_b5.Controller;

import com.hutech.kt_b5.Entities.Role;
import com.hutech.kt_b5.Entities.User;
import com.hutech.kt_b5.Services.RoleServices;
import com.hutech.kt_b5.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServices userServices;
    @Autowired
    private RoleServices roleServices;

    @GetMapping("")
    public String getAllStudent(Model model){
        List<User> users = userServices.getAllUser();
        model.addAttribute("user", users);
        return "User/getAll";
    }
    @GetMapping("/newUser")
    public String addStudent(Model model){
        User user = new User();
        List<Role> roles = roleServices.getAllRoles();
        model.addAttribute("user", user);
        model.addAttribute("role", roles);
        return "User/add";
    }
    @PostMapping("/save")
    public String saveUser(User userCreate){
//        userServices.(userCreate);
        return "redirect:/user";
    }
}
