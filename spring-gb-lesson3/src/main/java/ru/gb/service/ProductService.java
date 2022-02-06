package ru.gb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.entity.Product;
import ru.gb.repository.ProductRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product getProductById(Integer id){
        return productRepository.getProductById(id).orElseThrow(NoSuchElementException::new);
    }

    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }
}
