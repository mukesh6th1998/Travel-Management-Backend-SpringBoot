package com.example.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.config.MessageConfig;
import com.example.model.Travels;
import com.example.service.TravelsService;

@Component
public class TravelConsumer  {
	
	@Autowired
	TravelsService ts;
	
	@RabbitListener(queues=MessageConfig.QUEUE)
	public void consume(Travels travel) {

		ts.save(travel);
		System.out.println("Done");
	}
	

}
