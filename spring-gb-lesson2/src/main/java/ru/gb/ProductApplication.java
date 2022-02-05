package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.config.ProductConfiguration;

import java.util.Arrays;
import java.util.List;

public class ProductApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        System.out.println(productRepository.getAllProducts());

        Cart cart = context.getBean(Cart.class);
        System.out.println("--------------------");
        productRepository.getProductById(3).ifPresent(cart::addToCart);
        productRepository.getProductById(5).ifPresent(cart::addToCart);
        productRepository.getProductById(7).ifPresent(cart::addToCart);
        cart.viewProducts();
        System.out.println("--------------------");
        cart.removeFromCart(3);
        cart.removeFromCart(37);
        cart.viewProducts();
    }
}
