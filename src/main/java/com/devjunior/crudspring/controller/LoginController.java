package com.devjunior.crudspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjunior.crudspring.service.LoginService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    public LoginService loginService;

    @GetMapping(value = "/")
    public ResponseEntity primary() {
        return this.loginService.init();
    }

}
