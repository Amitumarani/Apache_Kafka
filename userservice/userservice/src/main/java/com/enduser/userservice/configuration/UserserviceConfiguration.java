package com.enduser.userservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;


@Configuration
public class UserserviceConfiguration {
	
	@KafkaListener(topics="General_Mesaage",groupId="group-1")
	public void generalMessage(String key, String value) {
		System.out.println(key);
		System.out.println(value);
	}

}
