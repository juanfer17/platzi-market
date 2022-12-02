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
        List<Product> products = (List<Product>) productRepository.findAll();
        return products;
    }

    public Optional<List<Product>> getByCategorieId(int categorieId){
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

    public boolean delete(int productId){
        return getProduct(productId)
                .map(product -> {
                    productRepository.deleteById(productId);
                    return true;
                }).orElse(false);
    }
}
