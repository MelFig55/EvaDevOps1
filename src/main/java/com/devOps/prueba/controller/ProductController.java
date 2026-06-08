package com.devOps.prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<String> getAllProducts() {
        return Arrays.asList("Laptop", "Mouse Mecánico", "Micrófono USB", "Monitor 24''");
    }
}