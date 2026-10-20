package security_cache.mateus9.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {

    private final RabbitTemplate rabbitTemplate;

    public PaymentConsumer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @RabbitListener (queues = "payment")
    public void teste (String message) {
        System.out.println(message);
    }

}
