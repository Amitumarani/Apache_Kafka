package com.deliveryboy.deliveryboy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryboy.deliveryboy.service.DeliveryBoyService;

@RestController
@RequestMapping("locationupdate")
public class DeliveryBoyController {
	
	@Autowired
	private DeliveryBoyService  deliveryBoyService;
	
	@PostMapping
	public ResponseEntity<?> sendLocation(){
		deliveryBoyService.sendLocationUpdate(String.valueOf(Math.random()));
		System.out.println("Location Updated");
		return ResponseEntity.ok("Location Updated");
	}

}
