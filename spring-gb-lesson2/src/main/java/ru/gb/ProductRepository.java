package ru.gb;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {
    private final List<Product> productList = new ArrayList<>();

    @PostConstruct
    public void init() {
        productList.add(new Product(1, "Fish", 10));
        productList.add(new Product(2, "Small fish", 5));
        productList.add(new Product(3, "Big fish", 20));
        productList.add(new Product(4, "The Fish", 1000));
        productList.add(new Product(5, "Tasty fish", 50));
    }

    public List<Product> getAllProducts(){
        return new ArrayList<>(productList);
    }

    public Optional<Product> getProductById(int id){
        Optional<Product> result = productList.stream().filter(product -> product.getId() == id).findFirst();
        return result;
    }
}
