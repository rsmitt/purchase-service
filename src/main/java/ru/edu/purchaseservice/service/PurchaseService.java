package ru.edu.purchaseservice.service;

import ru.edu.purchaseservice.model.Purchase;

import java.util.List;

public interface PurchaseService {
    Purchase save(Purchase purchase);

    List<Purchase> findAllPurchaseOfUser(Long userId);
}
