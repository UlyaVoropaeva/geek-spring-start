package app.component;


import org.springframework.stereotype.Component;
import javax.inject.Provider;

@Component
public class Shop {
    private final Provider<Cart> cartProvider;

    public Shop(Provider<Cart> cartProvider) {
        this.cartProvider = cartProvider;
    }

    public Cart getCart() {
        return cartProvider.get();
    }
}