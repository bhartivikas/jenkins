package com.project.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {

    @GetMapping(path = "/status")
    public String status() {
        return "UP and RUNNING";
    }

}
