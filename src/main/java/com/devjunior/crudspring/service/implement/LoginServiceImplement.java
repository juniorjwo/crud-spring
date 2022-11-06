package com.devjunior.crudspring.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devjunior.crudspring.service.LoginService;

@Service
public class LoginServiceImplement implements LoginService {


    public ResponseEntity init() {
     
        return new ResponseEntity("Primeiro método RestFull",HttpStatus.OK);
    }
    

}
