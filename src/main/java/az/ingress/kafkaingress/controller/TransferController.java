package az.ingress.kafkaingress.controller;

import az.ingress.kafkaingress.service.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
@AllArgsConstructor
public class TransferController {
    private final TransferService transferService;

    @PostMapping("/{name}")
    public ResponseEntity<String> produceString(@PathVariable String name) {
        return ResponseEntity.ok(transferService.produceString(name));
    }
}
