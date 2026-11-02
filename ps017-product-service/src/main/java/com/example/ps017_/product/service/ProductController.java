package com.example.ps017_.product.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository pr;

    @PostMapping("/product")
    public String addProduct(@RequestBody Product product) {
        pr.save(product);
        return "Product Saved";
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        return pr.findById(id).orElse(null);
    }
}