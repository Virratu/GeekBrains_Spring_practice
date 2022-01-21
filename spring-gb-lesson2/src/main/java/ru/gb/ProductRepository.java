package ru.gb;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    List<Product> productList = Arrays.asList(
            new Product(1,"Fish",10),
            new Product(2,"Small fish",5),
            new Product(3,"Big fish",20),
            new Product(4,"The Fish",1000),
            new Product(5,"Tasty fish",50)
    );
}
