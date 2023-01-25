package com.online.shop.service.controller;

import com.online.shop.service.business.UserServices;

import com.online.shop.service.domain.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created By ->  Ismail Sagir on 25.01.23
 * Project Name -> online-shop-service
 */
@RequestMapping("/api/users/v1")
@RestController
public class UserController {

private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }


    @GetMapping("/users/list")
    public ResponseEntity<List<com.online.shop.service.domain.User>> getAll(){
        return ResponseEntity.ok(userServices.getAll());
    }



    @PostMapping(value = "/users/add",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createUser(@RequestBody User newUser){
           userServices.addAll(newUser);
        return ResponseEntity.ok("Item added");
    }


}
