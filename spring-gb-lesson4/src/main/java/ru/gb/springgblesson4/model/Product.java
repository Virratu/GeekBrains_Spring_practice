package ru.gb.springgblesson4.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String title;
    private int cost;
}