package com.afoth.springmvctest1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by des on 18.03.17.
 */
@Controller
public class HomeController {


    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
