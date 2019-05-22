package com.fission.socketdemo.socket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

@RestController
public class SocketController {
	@Autowired
	private SimpMessagingTemplate template;

	  @RequestMapping(value = "/broadcastmsg",method = RequestMethod.POST)
	 //   @SendTo("/topic/greetings")
	    public String greeting(@RequestBody String message) throws Exception {
		  System.out.print("Test");
	        Thread.sleep(1000); // simulated delay
	        this.template.convertAndSend("/topic/status", message);
	        return message;
	    }
}
