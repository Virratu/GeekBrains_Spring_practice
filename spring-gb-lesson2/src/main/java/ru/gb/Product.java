package ru.gb;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Product {
    private int id;
    private String title;
    private Number cost;

}
