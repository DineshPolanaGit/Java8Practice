package kafka.example.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	Logger log  =LoggerFactory.getLogger(Consumer.class);
	private static final String TOPIC_NAME = "javainuse";
	
	@KafkaListener(topics = TOPIC_NAME, group = "myGroup")
	public void consume(String message) {
		log.info(String.format("$$$ consumed message -> %s", message));
		System.out.println("Message --> "+message);
	}

}
