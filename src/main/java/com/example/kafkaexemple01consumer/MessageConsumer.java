package com.example.kafkaexemple01consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "my-topic", groupId = "afm-notificacao")
    public void listen(Map<String,DataResquetDTO> dataResquetDTO) {
        DataResquetDTO dataResquetDTO1 = new ObjectMapper().convertValue(dataResquetDTO,DataResquetDTO.class);
        System.out.println("Received message: " + dataResquetDTO1);
    }
}
