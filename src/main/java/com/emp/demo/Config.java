package com.emp.demo;

import com.alianca.intercab.emp.quotation.IntercabQuotationV2;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

@Configuration
public class Config {

    @Bean
    public ConsumerFactory<String, IntercabQuotationV2> consumerFactory(KafkaProperties kafkaProperties) {
        return new DefaultKafkaConsumerFactory<>(kafkaProperties.buildConsumerProperties());
    }

    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, IntercabQuotationV2>> kafkaListenerContainerFactory(KafkaProperties kafkaProperties) {
        ConcurrentKafkaListenerContainerFactory<String, IntercabQuotationV2> factory = new ConcurrentKafkaListenerContainerFactory<String, IntercabQuotationV2>();
        factory.setConsumerFactory(consumerFactory(kafkaProperties));
        return factory;
    }
}
