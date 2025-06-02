package SpringBoot.inventory_service.consumer;


import SpringBoot.inventory_service.entity.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
    @KafkaListener(topics="order-events",groupId = "inventory-group")
    public void consumerOrder(Order order)
    {
        System.out.println("Inventory updated for:"+order);
    }

}

