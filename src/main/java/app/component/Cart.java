package app.component;

import app.rapository.ProductRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Cart {
    private final List<Product> products;

    private final ProductRepository productRepository;

    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.products = new ArrayList<>();
    }

    public void add(int id) {
        productRepository.getProductById(id).ifPresent(p -> products.add(p));
    }

    public void remove(int id) {
        products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(p -> products.remove(p));
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
