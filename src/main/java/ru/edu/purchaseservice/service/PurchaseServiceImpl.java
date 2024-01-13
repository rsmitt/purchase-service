package ru.edu.purchaseservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.edu.purchaseservice.model.Purchase;
import ru.edu.purchaseservice.repository.PurchaseRepository;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository repository;

    @Override
    public Purchase save(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return repository.save(purchase);
    }

    @Override
    public List<Purchase> findAllPurchaseOfUser(Long userId) {
        return repository.findAllByUserId(userId);
    }
}
