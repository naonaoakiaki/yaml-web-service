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

	private Human human;

	@RequestMapping("/makeyaml")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
        mav.addObject("name", "taro");
        mav.addObject("age", "16");
        mav.addObject("sex", "men");
		mav.setViewName("makeyaml"); //view名の指定
		return mav;
	}

//	@RequestMapping(value = "/makeyaml")
//	public String index(@ModelAttribute Human human) {
//		this.human = human;
//		return human.getName();
//	}
}
