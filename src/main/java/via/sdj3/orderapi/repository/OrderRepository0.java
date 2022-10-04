package via.sdj3.orderapi.repository;

import org.springframework.stereotype.Repository;
import via.sdj3.orderapi.model.Order0;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepository0
{
    private static final Map<Long, Order0> orderMap0 = new HashMap<>();
    static {
        initDataSource();
    }

    private static void initDataSource()
    {
        Order0 o1 = new Order0(1L, "Morning goodies", 25, true);
        Order0 o2 = new Order0(2L, "Middag BOYZ", 31, false);
        Order0 o3 = new Order0(3L, "Heilo girls", 25, true);


        orderMap0.put(o1.getId(), o1);
        orderMap0.put(o2.getId(), o2);
        orderMap0.put(o3.getId(), o3);

    }

    //CRUD operations (from interface-CrudRepository/ JpaRepo)

    // C - Create
    public void createOrder0(Long id, String description, double amount, boolean delivered)
    {
        orderMap0.put(id,new Order0(id,description,amount,delivered));
    }

    // R - Get
    public Order0 getOrder0(Long id)
    {
        return orderMap0.get(id);
    }

    // U - Update
    public void updateOrder0(Long id, String description, double amount, boolean delivered)
    {
        orderMap0.get(id).setDescription(description);
        orderMap0.get(id).setAmount(amount);
        orderMap0.get(id).setDelivered(delivered);
    }

    // D - Delete
    public void  deleteOrder0(Long id)
    {
        orderMap0.remove(id);
    }

    // R - find all
    public Map<Long, Order0> findAllOrder0()
    {
        return orderMap0;
    }





}
