package ru.gb.springgblesson4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.springgblesson4.model.Product;
import ru.gb.springgblesson4.services.ProductService;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all")
    public String showProductList(Model morel){
        morel.addAttribute("products", productService.getAllProducts());
        return "productList";
    }

    @GetMapping("/create")
    public String showSimpleForm(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "create-product";
    }

    @PostMapping("/create")
    public String processForm(Product product){
        productService.save(product);
        return "redirect:/products/all";
    }
}
