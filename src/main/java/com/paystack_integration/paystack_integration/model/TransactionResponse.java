package com.paystack_integration.paystack_integration.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@lombok.Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

    private Boolean status;
    private String message;
    private Data data;
}
