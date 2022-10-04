package Homework2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class Repository {
    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = new ArrayList<>(Arrays.asList(
                new Product(1L, "Milk", 30),
                new Product(2L, "Apple", 12),
                new Product(3L, "Potato", 15),
                new Product(3L, "Carrot", 12),
                new Product(3L, "Pineapple", 20)
        ));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product findById(Long id) {
        return productList.stream().filter(product -> product.getId().equals(id)).findAny().orElse(null);
    }
}
