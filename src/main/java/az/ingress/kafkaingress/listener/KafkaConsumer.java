package az.ingress.kafkaingress.listener;

import az.ingress.kafkaingress.entity.Transfer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumer {

    @RetryableTopic(attempts = "2" )
    @KafkaListener(topics = {"${topic.name}"}, groupId = "ms22-group-id")
    public void consumer(Transfer transfer, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                         @Header(KafkaHeaders.OFFSET) long offset) {
        log.info("Consumer data is : {} topic is : {} offset is : {}", transfer, topic, offset);
        if (transfer.getName().equals("Murad")) {
            throw new RuntimeException("Invalid name !");
        }
    }

    @DltHandler
    public void listenDlt(Transfer transfer, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                          @Header(KafkaHeaders.OFFSET) long offset) {
        log.info("Dlt data is : {} topic is : {} offset is : {}", transfer, topic, offset);
    }
}
