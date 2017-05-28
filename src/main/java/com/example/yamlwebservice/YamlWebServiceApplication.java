package com.example.yamlwebservice;

import com.example.yamlwebservice.entity.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class YamlWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YamlWebServiceApplication.class, args);
    }

    @RequestMapping("/makeyaml")
    public ModelAndView index(@ModelAttribute Human human) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", human.getName());
        mav.addObject("age", human.getAge());
        mav.addObject("gender", human.getGender());
        mav.setViewName("makeyaml"); //view名の指定
        return mav;
    }
}