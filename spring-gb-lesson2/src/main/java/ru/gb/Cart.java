package ru.gb;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Scope("prototype")
public class Cart {

    private final HashMap<Integer, Product> products = new HashMap<>();

    public void addToCart(Product product){
        if(!products.containsKey(product.getId())){
            products.put(product.getId(),product);
        }
    }

    public void removeFromCart(Integer id){
        products.remove(id);
    }

    public void viewProducts(){
        System.out.println(products);
    }
}
