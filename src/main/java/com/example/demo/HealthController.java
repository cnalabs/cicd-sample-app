package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "")
public class HealthController {

    @GetMapping(value = "/")
    public ResponseEntity health(){
        Map<String, String> map = new HashMap<>();
        map.put("status", "ok");
        return new ResponseEntity(map, HttpStatus.OK);
    }
}
