package app.rapository;

import app.component.Order;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderRepository {
    private final List<Order> products = new ArrayList<>();
    private final AtomicInteger counter = new AtomicInteger(1);


    public Optional<Order> getOrderById(int id) {

        for (Order product : products) {
            if (product.getId() == id) {
                return Optional.of(product);
            }
        }

        return Optional.empty();

    }

    public List<Order> getOrders() {
        return products;
    }

    public void addOrder(Order product) {
        product.setId(counter.getAndIncrement());
        products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Order product : products) {
            builder.append(product.getId());
            builder.append(" - ");
            builder.append(product.getDate());
            builder.append(" - ");
            builder.append(product.getName());
            builder.append(" - ");
            builder.append(product.getPrice());
            builder.append(" money\n");
        }

        return builder.toString();
    }
}
