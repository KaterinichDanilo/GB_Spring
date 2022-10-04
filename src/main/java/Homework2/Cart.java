package Homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private List<Product> productListCart;
    @Autowired
    private ProductService productService;

    @PostConstruct
    private void init() {
        productListCart = new ArrayList<>();
    }

    public void addById(Long id) {
        System.out.println(id);
        if (productService.getProductById(id) != null) {
            productListCart.add(productService.getProductById(id));
        }
    }

    public void deleteById(Long id) {
        productListCart.remove(productListCart.indexOf(productService.getProductById(id)));
    }

    public void showCart() {
        if (productListCart.size() == 0) {
            System.out.println("Your cart is empty( Buy something!");
            return;
        }

        for (Product product : productListCart) {
            System.out.println(product.getId() + " " + product.getTitle() + " " + product.getPrice());
        }
        System.out.println("_________");
    }
}
