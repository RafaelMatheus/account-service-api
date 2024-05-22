package com.wallet.accountmanagementservice.core.port;

import org.springframework.amqp.core.Message;

public interface RabbitMqPort {
    void send(Message message, String routingKey, String exchange);
}
