package com.example.northwind.webapi.controllers;

import com.example.northwind.core.utilities.result.Result;
import com.example.northwind.dataAccess.abstracts.ProductRepository;
import com.example.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")

public class ProductsController {
    private ProductRepository productRepository;

    @Autowired
    public ProductsController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/getAll")
    public List<Product> getAll() {
        return this.productRepository.findAll();
    }

    @PostMapping("/add")
    public Result add() {
        return new Result(true, "Ürün eklendi.");
    }
}