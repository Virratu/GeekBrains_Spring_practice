package ru.gb.servlet;

import ru.gb.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ProductHttpServlet", urlPatterns = "/product")
public class BasicServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("Products", getProducts());
        getServletContext().getRequestDispatcher("/product.jsp").forward(req, resp);
    }

    private List<Product> getProducts() {
        List<Product> products = Arrays.asList(
                new Product(1,"Fish",10),
                new Product(2,"Small fish",5),
                new Product(3,"Big fish",20),
                new Product(4,"The Fish",1000),
                new Product(5,"Tasty fish",50),
                new Product(6,"Not poisoned fish",100),
                new Product(7,"Salty fish",24),
                new Product(8,"Finnish Fish",40),
                new Product(9,"Surstremming",7),
                new Product(10,"Fishy guy",9720)
        );
        return products;
    }


}
