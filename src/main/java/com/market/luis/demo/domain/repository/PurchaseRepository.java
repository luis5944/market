package com.market.luis.demo.domain.repository;

import com.market.luis.demo.domain.Purchase;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface PurchaseRepository {
    List<Purchase> getAll();

    Optional<List<Purchase>> getByClient(String clientId);

    Purchase save(Purchase purchase);
}
