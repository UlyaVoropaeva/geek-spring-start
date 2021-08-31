package app.configuration;

import app.rapository.ProductRepository;
import app.component.Cart;
import app.component.Shop;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ShopConfiguration {
    private final ProductRepository productRepository;
    private final Shop shop;

    public ShopConfiguration(ProductRepository productRepository, Shop shop) {
        this.productRepository = productRepository;
        this.shop = shop;
    }

    public void start() {
       Cart cart = shop.getCart();
        int parameter;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println(menu());

                parameter = scanner.nextInt();

                switch (parameter) {
                    case 1:
                        System.out.println(productRepository);
                        break;
                    case 2:
                        cart.add(scanner.nextInt());
                        break;
                    case 3:
                        cart.remove(scanner.nextInt());
                        break;
                    case 4:
                        System.out.println(cart);
                        break;
                    case 5:
                        cart = shop.getCart();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Ошибка в выборе меню.");
                }
            }
        }

    }

    private String menu() {
        return "\n *** Меню ***\n" +
                "1. Расспечатать все продукты\n" +
                "2. Добавить продукт в корзину ( введите id)\n" +
                "3. Удалить продукт из корзины (введите id)\n" +
                "4. Распечатать корзину\n" +
                "5. Создать новую корзину\n" +
                "6. Выход";
    }

}
