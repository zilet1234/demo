package com.example.board.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello world ~ ";
    }

    @RequestMapping(value = "/jspHello", method = RequestMethod.GET)
    public String jspHello(Model model){
        model.addAttribute("name","jsp Hello start !");
        return "/jspHello";
    }


}
