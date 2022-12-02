package com.platzi.market.services;

import com.platzi.market.model.Product;
import com.platzi.market.model.Purchase;
import com.platzi.market.repository.ProductRepository;
import com.platzi.market.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        List<Purchase> purchases = (List<Purchase>) purchaseRepository.findAll();
        return purchases;
    }
}
