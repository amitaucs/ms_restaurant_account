package com.digi.accounting.config;

import com.digi.accounting.service.ClientRegistrationEventReveiver;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.digi.accounting.constant.RabbitMqConstant.QUEUE_NAME;

@Configuration
public class RabbitMqConfig {

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(QUEUE_NAME);
        container.setMessageListener(listenerAdapter);
        return container;
    }

    @Bean
    ClientRegistrationEventReveiver receiver() {
        return new ClientRegistrationEventReveiver();
    }

    @Bean
    MessageListenerAdapter listenerAdapter(ClientRegistrationEventReveiver receiver) {
        return new MessageListenerAdapter(receiver, "receive new client registry");
    }

}
