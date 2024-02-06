package com.honeyjoojoo.webchatting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class TemplateController {

  @GetMapping
  public String getChatting() {
    return "/chatting";
  }
}
