package com.example.demo.controller;

import com.example.demo.domain.MyMessage;
import com.example.demo.service.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    JsonUtils jsonUtils;

    @GetMapping("/")
    public String hello(){
        return "Hello Word!";
    }

    @GetMapping("/api/breeds/list/all")
    public ResponseEntity<?> getMessage(){
        Map<String, List<String>> data = jsonUtils.parseJson();
        if (data != null){
            MyMessage myMessage = new MyMessage();
            myMessage.setStatus("success");
            myMessage.setMessage(data);
            return ResponseEntity.ok(myMessage);
        }
        return new ResponseEntity<>(HttpStatus.NOT_EXTENDED);
    }

}
