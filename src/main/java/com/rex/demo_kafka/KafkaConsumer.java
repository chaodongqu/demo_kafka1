package com.rex.demo_kafka;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;


public class KafkaConsumer {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        log.info("test topic message : {}", message);
    }

}
