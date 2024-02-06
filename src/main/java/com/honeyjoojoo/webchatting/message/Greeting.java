package com.honeyjoojoo.webchatting.message;

import lombok.Getter;

@Getter
public class Greeting implements WebSocketMessage {

  private final String content;

  public Greeting(String content) {
    this.content = content;
  }
}
