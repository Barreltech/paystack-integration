package com.paystack_integration.paystack_integration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class InitializeTransactionDto {


    private String email;
    private String amount;
    private String currency;

}
