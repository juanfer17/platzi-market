package com.platzi.market.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.platzi.market.model.Product;
import com.platzi.market.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") int productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/category/{categorieId}")
    public List<Product> getByCategorieId(@PathVariable("categorieId")int categorieId){
        return productService.getByCategorieId(categorieId);
    }

    public Optional<List<Product>> getByLow(int stockAmount, boolean status){
        return productService.getByLow(stockAmount, status);
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int productId) {
        productService.delete(productId);
    }
}
