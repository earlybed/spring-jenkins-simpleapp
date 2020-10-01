package com.cc.springmvc.controller;

import com.cc.springmvc.domain.User;
import com.cc.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("list")
    public String findAll(Model model){
        List<User> list = userService.findAll();
        model.addAttribute("userList",list);
        return "user/list";
    }

    @PostMapping("add")
    public String saveUser(User user){
        user.setType("1");
        userService.saveUser(user);
        return "redirect:/user/list";
    }
    @GetMapping("toAdd")
    public String toSaveUser(){
        return "user/add";
    }

    @PostMapping("delete")
    public String deleteUser(int id){
        userService.deleteUser(id);
        return "redirect:/user/list";
    }

    @GetMapping("toDelete")
    public String toDeleteUser(){
        return "user/delete";
    }

    @PostMapping("update")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/user/list";
    }

    @GetMapping("toUpdate")
    public String toUpdateUser(User user){
        return "user/update";
    }
}
