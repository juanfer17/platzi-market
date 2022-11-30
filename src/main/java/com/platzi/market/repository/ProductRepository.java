package com.platzi.market.repository;

import com.platzi.market.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository <Product, Integer> {

    List<Product> findByCategorieIdOrderByNameAsc(int categorieId);
    Optional<List<Product>> findByStockAmountLessThanAndState(int stockAmount, boolean status);


}
