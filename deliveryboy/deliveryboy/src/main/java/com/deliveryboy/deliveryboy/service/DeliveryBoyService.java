package com.deliveryboy.deliveryboy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeliveryBoyService {
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	public DeliveryBoyService(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	public boolean sendLocationUpdate(String location) {
		kafkaTemplate.send("General_Mesaage", location);
		return true;
	}
}
