package com.honeyjoojoo.webchatting.message;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Hello implements WebSocketMessage {

  private String name;
}
