package com.example.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JsonUtils {
    public Map<String, List<String>> parseJson(){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = JsonUtils.class.getClassLoader().getResourceAsStream("apidata.json");
            return objectMapper.readValue(inputStream, Map.class);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
