package via.sdj3.orderapi.controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import via.sdj3.orderapi.model.Order0;
import via.sdj3.orderapi.repository.OrderRepository0;

import java.awt.*;
import java.util.Map;

@RestController
@RequestMapping("/v0")
public class OrderController0
{
    private OrderRepository0 orderRepo;

    public OrderController0(OrderRepository0 orderRepository0)
    {
        this.orderRepo = orderRepository0;
    }

    //@GetMapping
    @RequestMapping(value = "/orders/{id}",
            method = RequestMethod.GET //,
//            produces = {MediaType.APPLICATION_XML_VALUE,
//                    MediaType.APPLICATION_JSON_VALUE}
        )
    @ResponseBody
    public Order0 getOrderById(@PathVariable Long id)
    {
        return orderRepo.getOrder0(id);
    }

    @RequestMapping(value = "/orders",
            method = RequestMethod.POST ,
            produces = {MediaType.APPLICATION_XML_VALUE} //,
//                    MediaType.APPLICATION_JSON_VALUE}
    )
    @ResponseBody
    public Order0 getallOrders(@RequestBody Order0 order0)
    {
        orderRepo.createOrder0(order0.getId(),order0.getDescription(),order0.getAmount(),order0.isDelivered());
        return orderRepo.getOrder0(order0.getId());
    }
}
