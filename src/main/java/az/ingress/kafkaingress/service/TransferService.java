package az.ingress.kafkaingress.service;

import az.ingress.kafkaingress.entity.Transfer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransferService {

    @Value("${topic.name}")
    private String topicName;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public String produceString(String name) {
        Transfer transfer = Transfer.builder()
                .name(name)
                .balance(500.0)
                .build();
        try {
            CompletableFuture<SendResult<String, Object>> sendResult =
                    kafkaTemplate.send(topicName, transfer);

            sendResult.whenComplete((result, ex) -> {

                if (ex == null) {
                    log.info("Data successfully sending to kafka");
                } else {
                    log.error("There occur error");
                }
            });
        }catch (Exception e) {
            log.error("Error sending message to Kafka ", e);
            return "Error sending message to Kafka "+e.getMessage();
        }
        return "Ok";
    }
}
