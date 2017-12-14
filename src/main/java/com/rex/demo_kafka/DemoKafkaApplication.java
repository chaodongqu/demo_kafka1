package com.rex.demo_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class DemoKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoKafkaApplication.class, args);
	}



	@Bean
	public KafkaConsumer kafkaListenerPractices() {
		return new KafkaConsumer();
	}

}
