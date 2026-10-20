package security_cache.mateus9.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PaymentProducer {

    private final RabbitTemplate rabbitTemplate;

    public PaymentProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Bean
    public void test () {
        System.out.println("test");
    }

}
