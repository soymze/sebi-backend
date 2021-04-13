package com.rtu.sebi.controller;

import com.rtu.sebi.document.SebiUser;
import com.rtu.sebi.service.SebiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class SebiUserController {

    @Autowired
    private SebiUserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public SebiUser getUser(@RequestParam String userId){
        return userService.getById(userId);
    }

}
