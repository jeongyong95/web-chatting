package com.honeyjoojoo.webchatting.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    registry.addEndpoint("/handshake");
  }

  @Override
  public void configureMessageBroker(MessageBrokerRegistry registry) {
    // client의 pub path prefix
    registry.setApplicationDestinationPrefixes("/app")
        // subscribe하는 client를 위해 브러커 활성화
        .enableSimpleBroker("/topic");
  }
}
