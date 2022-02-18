package ru.gb.springgblesson4.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.springgblesson4.model.Product;
import ru.gb.springgblesson4.repository.ProductRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository products;

    public Product save(Product product){
        return products.save(product);
    }

    public Product getProductById(Integer id){
        return products.getProductById(id).orElseThrow(NoSuchElementException::new);
    }

    public List<Product> getAllProducts(){
        return products.getAllProducts();
    }
}
