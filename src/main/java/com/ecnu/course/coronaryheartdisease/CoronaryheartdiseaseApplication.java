package com.ecnu.course.coronaryheartdisease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class CoronaryheartdiseaseApplication {
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "helloword!";
    }
    public static void main(String[] args) {
      
        SpringApplication.run(CoronaryheartdiseaseApplication.class, args);
    }

}
