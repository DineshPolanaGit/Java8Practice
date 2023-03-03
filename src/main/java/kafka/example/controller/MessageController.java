package kafka.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kafka.example.service.MessageService;

@RestController
public class MessageController {
	@Autowired
	MessageService msgService;
	
	@GetMapping("/to/{msg}")
	public String pushMsgToKafka(@PathVariable String msg) {
		msgService.sendMessage(msg);
		return "Message successfully published to the topic";
	}

}
