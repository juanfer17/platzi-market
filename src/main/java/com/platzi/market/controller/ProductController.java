package com.platzi.market.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.platzi.market.model.Product;
import com.platzi.market.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    public Optional<Product> getProduct(int productId){
        return productService.getProduct(productId);
    }

    public List<Product> getByCategorieId(int categorieId){
        return productService.getByCategorieId(categorieId);
    }

    public Optional<List<Product>> getByLow(int stockAmount, boolean status){
        return productService.getByLow(stockAmount, status);
    }

    public Product save(Product product){
        return productService.save(product);
    }

    public void delete(int productId) {
        productService.delete(productId);
    }
}
