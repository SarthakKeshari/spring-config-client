package com.example.greetingservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class GreetingController {

    @Value("${my.greeting}")
    private String greeting;

    @Value("${application.specific.config}")
    private String specificConfig;

    @GetMapping("/greet")
    public Map<String, String> sayHello() throws JsonProcessingException {
        Map<String, String> map = new HashMap<>();
        map.put("Greeting", greeting);
        map.put("Application Specific Property", specificConfig);

        return map;
    }
}

