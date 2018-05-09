package demo.controller;

import demo.model.CurrentPositionDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    //relay
    @MessageMapping("/sendMessage")
    @SendTo("/topic/locations")
    public CurrentPositionDto sendMessage(CurrentPositionDto message){
        return message;
    }
}
