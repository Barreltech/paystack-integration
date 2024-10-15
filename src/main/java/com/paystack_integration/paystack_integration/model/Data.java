package com.paystack_integration.paystack_integration.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
@ToString
public class Data {

    private String authorization_url;
    private String access_code;
    private String reference;

}
