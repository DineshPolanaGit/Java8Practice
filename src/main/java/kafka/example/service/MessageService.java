package kafka.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	private static final String TOPIC_NAME = "javainuse";
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void sendMessage(String msg) {
		log.info(String.format("Produced Message --> %s",msg));
		kafkaTemplate.send(TOPIC_NAME, msg);
	}

}
