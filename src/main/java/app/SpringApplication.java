package app;


import app.component.Cart;
import app.configuration.ApplicationConfiguration;
import app.rapository.ProductRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Cart cart = context.getBean(Cart.class);
        System.out.println(cart);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        System.out.println(productRepository);

    }
}
