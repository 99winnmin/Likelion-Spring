package com.jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) { // Model은 데이터를 담아서 view로 보낼 수 있음
        model.addAttribute("data", "hello!!");
        return "hello"; // hello.html이 자동으로 매핑됨
    }
}
