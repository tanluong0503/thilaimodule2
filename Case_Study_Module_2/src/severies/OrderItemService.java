package severies;

import model.OrderItem;
import utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;

public class OrderItemService implements IOderItemService{
    private final static String PATH = "data/order-items.csv";
    private static OrderItemService instance;

    private OrderItemService() {
    }

    public static OrderItemService getInstance() {
        if (instance == null)
            instance = new OrderItemService();
        return instance;
    }

    @Override
    public List<OrderItem> findAll() {
        List<OrderItem> orderItems = new ArrayList<>();
        List<String> records = CSVUtils.read(PATH);
        for (String record : records) {
            orderItems.add(new OrderItem(record));
        }
        return orderItems;
    }

    @Override
    public void add(OrderItem newOrderItem) {
        List<OrderItem> orderItems = findAll();
        orderItems.add(newOrderItem);
        CSVUtils.write(PATH, orderItems);
    }


    @Override
    public void update(OrderItem newOrderItem) {
        List<OrderItem> orderItems = findAll();
        CSVUtils.write(PATH, orderItems);
    }

    @Override
    public OrderItem getOrderItemById(int id) {
        List<OrderItem> orderItems = findAll();
        for (OrderItem orderItem : orderItems) {
            if (orderItem.getId() == id)
                return orderItem;
        }
        return null;
    }


}
