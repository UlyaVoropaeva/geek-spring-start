package app.rapository;

import app.component.Order;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public OrderRepository() {
        orders.add(new Order(1, LocalDate.now(), 12.8f, Collections.emptyList()));

    }

    public Optional<Order> getById(int id) {

        return orders.stream().filter(o -> o.getId() == id).findFirst();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
}
