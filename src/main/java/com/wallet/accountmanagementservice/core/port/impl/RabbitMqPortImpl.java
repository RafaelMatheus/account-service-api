package com.wallet.accountmanagementservice.core.port.impl;

import com.wallet.accountmanagementservice.core.port.RabbitMqPort;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class RabbitMqPortImpl implements RabbitMqPort {
    private final RabbitTemplate template;

    public RabbitMqPortImpl(RabbitTemplate template) {
        this.template = template;
    }

    @Override
    public void send(Message message, String routingKey, String exchange) {
        template.send(exchange, routingKey, message);
    }
}
