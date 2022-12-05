package com.platzi.market.services;

import com.platzi.market.model.Product;
import com.platzi.market.model.Purchase;
import com.platzi.market.repository.ProductRepository;
import com.platzi.market.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        List<Purchase> purchases = (List<Purchase>) purchaseRepository.findAll();
        return purchases;
    }

    public Optional<List<Purchase>> getByClient(String clientId){
        return purchaseRepository.findByClientId(clientId);
    }

    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }
}
