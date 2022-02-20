package com.patika.paycore.DebitCardManagementHelper.messaging.consumer;

import com.patika.paycore.DebitCardManagementHelper.config.RabbitMQConfig;
import com.patika.paycore.DebitCardManagementHelper.model.Customer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Customer customer){
        System.out.println("Customer message received & consumed from queue :"+ customer);
    }
}
