package app.component;

import java.util.Date;

public class Order {

    private int id;
    private Date date;
    private String name;
    private int price;

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public Order(int id, Date date, String name, int price) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.price = price;
    }
}
