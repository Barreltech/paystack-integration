package com.paystack_integration.paystack_integration.service;

import com.paystack_integration.paystack_integration.dto.InitializeTransactionDto;
import com.paystack_integration.paystack_integration.model.TransactionResponse;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


@Service
public class TransactionService {

    private static final RestTemplate restTemplate = new RestTemplate();
    public ResponseEntity<?> initializeTransaction (InitializeTransactionDto dto){
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();

        parameters.add("email",dto.getEmail());
        parameters.add("amount", dto.getAmount());
        parameters.add("currency", dto.getCurrency());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.valueOf(MediaType.APPLICATION_FORM_URLENCODED_VALUE));

        httpHeaders.set("Authorization", "Bearer sk_test_69a077e24d5bf720acabb39dfead3c065262f69e");

        HttpEntity request = new HttpEntity<>( parameters,httpHeaders);

        String url = "https://api.paystack.co/transaction/initialize";
        ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.POST,request, TransactionResponse.class);
        return response;

    }

    public ResponseEntity<?> verifyTransaction (String reference){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.valueOf(MediaType.APPLICATION_FORM_URLENCODED_VALUE));

        httpHeaders.set("Authorization", "Bearer sk_test_69a077e24d5bf720acabb39dfead3c065262f69e");

        HttpEntity request = new HttpEntity<>( httpHeaders);

        String url = "https://api.paystack.co/transaction/verify/" + reference;
        ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.GET,request, Object.class);
        return response;

    }

}
