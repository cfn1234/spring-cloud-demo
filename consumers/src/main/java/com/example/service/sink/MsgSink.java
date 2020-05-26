package com.example.service.sink;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;

/**
 * com.example.springstreamconsumers.sink
 *
 * @author caofengnian
 * @Date 2020-01-13
 */
@EnableBinding(Sink.class)
public class MsgSink {
	
	@StreamListener(Sink.INPUT)
	public void process(Message<?> message) {
		System.out.println(message.getPayload());
		Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);
		if (acknowledgment != null) {
			System.out.println("Acknowledgment provided");
			acknowledgment.acknowledge();
		}
	}

}
