package com.platzi.market.repository;

import com.platzi.market.model.Product;
import com.platzi.market.model.Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaseRepository extends CrudRepository <Purchase, Integer> {


}
