package app.component;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private int id;
    private LocalDate date;
    private List<Product> products;
    private float cost;


    public Order() {
    }

    public Order(int id, LocalDate date, float cost, List<Product> products) {
        this.id = id;
        this.date = date;
        this.products = products;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public float getCost() {
        return cost;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", products=" + products +
                ", cost=" + cost +
                '}';
    }
}
