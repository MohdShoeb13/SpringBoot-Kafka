package com.apachekafka.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("demo_topic").build();
    }

    @Bean
    public NewTopic jsonTopic() {
        return TopicBuilder.name("kafkaDemoTopic_json").build();
    }
}
