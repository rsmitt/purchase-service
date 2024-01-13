package ru.edu.purchaseservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.edu.purchaseservice.model.Purchase;
import ru.edu.purchaseservice.service.PurchaseService;

@RestController
@RequestMapping("api/purchase")
@AllArgsConstructor
public class PurchaseController {

    private final PurchaseService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(service.save(purchase), HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllPurchaseOfUser(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(service.findAllPurchaseOfUser(userId));
    }
}
