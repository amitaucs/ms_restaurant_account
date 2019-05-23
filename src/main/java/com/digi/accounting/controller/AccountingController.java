package com.digi.accounting.controller;

import com.digi.accounting.model.AccountResponse;
import com.digi.accounting.model.ConsumerAccount;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@CrossOrigin(value = "*")
public class AccountingController {


    @PostMapping(path = "/createNewConsumerAccount")
    public ResponseEntity<AccountResponse> createNewConsumerAccount(@RequestBody ConsumerAccount consumerAccount){

        return null;
    }

    @PutMapping(path = "/updateConsumerAccountBalance")
    public ResponseEntity<AccountResponse> updateConsumerAccountBalance(@RequestBody ConsumerAccount consumerAccount){

        return null;
    }

    @PutMapping(path = "/validateConsumerBalance")
    public ResponseEntity<AccountResponse> validateConsumerBalance(@RequestBody ConsumerAccount consumerAccount){

        return null;
    }

    @GetMapping("/getConsumerBalance")
    public ResponseEntity<AccountResponse> getConsumerBalance(@RequestParam(value="consumerId") String consumerId) {

        return null;
    }
}
