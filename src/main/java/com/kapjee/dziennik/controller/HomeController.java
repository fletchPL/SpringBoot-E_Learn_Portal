package com.kapjee.dziennik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String hello(@RequestParam(value="name", required=false, defaultValue="Welcome!")String name, Model model)
  {
    model.addAttribute("name", name);
    return "hello";
  }

}
