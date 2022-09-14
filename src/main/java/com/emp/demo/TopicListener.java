package com.emp.demo;

import com.alianca.intercab.emp.quotation.IntercabQuotationV2;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.commons.lang.SerializationException;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Slf4j
@RequiredArgsConstructor
@Service
public class TopicListener {

    private String topicName;

    @KafkaListener(topics = "ANL.intercab.quotation.topic.internal.any.v2", groupId = "ANL.intercab.pricingarchcdt.consumerGroup.v1",containerFactory = "kafkaListenerContainerFactory")
    public void consume(ConsumerRecord<String, IntercabQuotationV2> payload){
        log.info("Tópico listener: {}", topicName);
        log.info("key: {}", payload.key());
        log.info("Headers: {}", payload.headers());
        log.info("Partion: {}", payload.partition());
        log.info("Order: {}", payload.value());

    }

}