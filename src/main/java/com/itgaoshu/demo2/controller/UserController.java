package com.itgaoshu.demo2.controller;


import com.itgaoshu.demo2.bean.Tuser;
import com.itgaoshu.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/selectUsers")
    public String selectUser(Model model){
        List<Tuser> users=userService.selectUsers();
        model.addAttribute("users",users);
        return "list";
    }
}
