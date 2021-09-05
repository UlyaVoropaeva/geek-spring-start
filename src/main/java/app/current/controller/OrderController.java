package app.current.controller;

import app.component.Order;
import app.rapository.OrderRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class OrderController {
	private final OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/orders/add", method = RequestMethod.POST)
    public String add(Order order) {
        repository.addOrder(order);
        return "orders";
    }
    @RequestMapping(value = "/orders/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("order", new Order());
        return "orders-add";
    }
    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String getOrders(Model model) {
        model.addAttribute("orders", repository.getOrders());
        return "orders";
    }

    @Override
    public String toString() {
        return "OrderController{" +
                "repository=" + repository +
                '}';
    }
}
