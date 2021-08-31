package app.rapository;


import app.component.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();
    private final AtomicInteger counter = new AtomicInteger(1);

    @PostConstruct
    private void fillProductsList() {
        products.add(new Product(counter.getAndIncrement(), "Apple", 10));
        products.add(new Product(counter.getAndIncrement(), "Tomato", 20));
        products.add(new Product(counter.getAndIncrement(), "Cucumber", 15));
        products.add(new Product(counter.getAndIncrement(), "Potato", 18));
        products.add(new Product(counter.getAndIncrement(), "Raspberry", 30));
    }


    public Optional<Product> getProductById(int id) {

        for (Product product : products) {
            if (product.getId() == id) {
                return Optional.of(product);
            }
        }

        return Optional.empty();

    }

    public List<Product> getProducts() {
        return products;
    }

    public void add(Product product) {
        product.setId(counter.getAndIncrement());
        products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Product product : products) {
            builder.append(product.getId());
            builder.append(" - ");
            builder.append(product.getName());
            builder.append(" - ");
            builder.append(product.getPrice());
            builder.append(" money\n");
        }

        return builder.toString();
    }
}
