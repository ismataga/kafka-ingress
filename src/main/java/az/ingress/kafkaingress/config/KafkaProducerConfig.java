package az.ingress.kafkaingress.config;

import lombok.extern.slf4j.Slf4j;

//@Configuration
@Slf4j
public class KafkaProducerConfig {
//    @Bean
//    Map<String, Object> producerConfigs() {
//        Map<String, Object> props = new HashMap<>();
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//        return props;
//    }
//
//    @Bean(name="defaultRetryTopicKafkaTemplate")
//    ProducerFactory<String, String> producerFactory() {
//        return new DefaultKafkaProducerFactory<>(producerConfigs());
//    }
//
//    @Bean
//    KafkaTemplate<String, String> kafkaTemplate() {
//        KafkaTemplate<String, String> kafkaTemplate = new KafkaTemplate<>(producerFactory());
//        kafkaTemplate.setMessageConverter(new StringJsonMessageConverter());
//        return kafkaTemplate;
//    }
//
//    @Bean
//    public ProducerFactory<String, Object> objectProducerFactory() {
//        return new DefaultKafkaProducerFactory<>(producerConfigs());
//    }
//
//    @Bean
//    public KafkaTemplate<String, Object> objectKafkaTemplate() {
//        return new KafkaTemplate<>(objectProducerFactory());
//    }

}
