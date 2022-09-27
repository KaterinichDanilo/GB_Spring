package Homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    private Repository repository;

    public String getTitleById(Long id) {
        return repository.findById(id).getTitle();
    }

    public Product getProductById(Long id) {
        return repository.findById(id);
    }

    public List<Product> getListProducts(Long id) {
        return repository.getProductList();
    }
}
