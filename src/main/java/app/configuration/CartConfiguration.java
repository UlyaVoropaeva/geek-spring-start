package app.configuration;

import app.component.Cart;
import app.component.Shop;
import app.rapository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.inject.Provider;

@Configuration
public class CartConfiguration {
    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    public Cart cart(ProductRepository productRepository) {
        return new Cart(productRepository);
    }

    @Bean
    public Shop shop(Provider<Cart> cartProvider) {
        return new Shop(cartProvider);
    }


}
