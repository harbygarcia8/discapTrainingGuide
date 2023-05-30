package com.discaptraining.apimedicalhistory.controller;

import com.discaptraining.apimedicalhistory.domain.entity.DiscapUser;
import com.discaptraining.apimedicalhistory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("DiscapUser")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<DiscapUser> getDiscapUserRegisterType(String registerType){
       return userService.getDiscapUserRegisterType(registerType);
    }
}
