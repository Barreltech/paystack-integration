package com.paystack_integration.paystack_integration.controller;

import com.paystack_integration.paystack_integration.dto.InitializeTransactionDto;
import com.paystack_integration.paystack_integration.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TransactionApi {

    @Autowired
    TransactionService transactionService;
    @PostMapping("transaction/initialize")
    public ResponseEntity<?>initializeTransaction(@RequestBody InitializeTransactionDto dto){

        return transactionService.initializeTransaction(dto);

    }
    @GetMapping("transaction/verify/{reference}")
    public ResponseEntity<?>verifyTransaction(@PathVariable("reference") String reference){

        return transactionService.verifyTransaction(reference);

    }
}
