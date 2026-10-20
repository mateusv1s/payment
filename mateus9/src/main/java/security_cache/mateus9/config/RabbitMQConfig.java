package security_cache.mateus9.config;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;

@Configuration
public class RabbitMQConfig {

    // entendi que connection factory é o responsável por fornecer as conexões com o broker, ele utiliza informações como host, porta, usuário e senha
    // messageconverter basicamente tem um fluxo de objeto - json - objeto novamente
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory, MessageConverter messageConverter) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter((org.springframework.amqp.support.converter.MessageConverter) messageConverter);
        return rabbitTemplate;
    }

}
