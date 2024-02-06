package com.honeyjoojoo.webchatting.controller;

import com.honeyjoojoo.webchatting.message.Greeting;
import com.honeyjoojoo.webchatting.message.Hello;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Slf4j
@Controller
public class GreetingController {

  @MessageMapping("/hello") // client publishing path
  @SendTo("/topic/greetings") // client subscribing path
  public Greeting greeting(Hello hello) {
    log.info("client sent message: %s".formatted(hello));
    return new Greeting("Hello, %s!".formatted(HtmlUtils.htmlEscape(hello.getName())));
  }
}
