package az.ingress.kafkaingress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaIngressApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaIngressApplication.class, args);
    }

}
