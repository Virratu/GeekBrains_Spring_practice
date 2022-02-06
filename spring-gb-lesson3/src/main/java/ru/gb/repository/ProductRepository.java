package ru.gb.repository;

import org.springframework.stereotype.Component;
import ru.gb.entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {

    List<Product> productList = new ArrayList<>();

    public Product save(Product product){
        product.setId(productList.size());
        productList.add(product);
        return Product.builder()
                .id(product.getId())
                .title(product.getTitle())
                .cost(product.getCost())
                .build();
    }

    public List<Product> getAllProducts(){
        return new ArrayList<>(productList);
    }

    public Optional<Product> getProductById(int id){
        if (id < productList.size()){
            Product result = productList.get(id);
            return Optional.of(Product.builder().id(result.getId()).title(result.getTitle()).cost(result.getCost()).build());
        } else {
            return Optional.empty();
        }

    }
}
