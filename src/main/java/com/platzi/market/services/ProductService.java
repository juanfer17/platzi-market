package com.platzi.market.services;

import com.platzi.market.model.Product;
import com.platzi.market.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return (List<Product>) productRepository.findAll();
    }

    public List<Product> getByCategorieId(int categorieId){
        return productRepository.findByCategorieIdOrderByNameAsc(categorieId);
    }

    public Optional<List<Product>> getByLow(int stockAmount, boolean status){
        return productRepository.findByStockAmountLessThanAndState(stockAmount, status);
    }

    public Optional<Product> getProduct(int productId){
        return productRepository.findById(productId);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void delete(int productId){
        productRepository.deleteById(productId);
    }

}
