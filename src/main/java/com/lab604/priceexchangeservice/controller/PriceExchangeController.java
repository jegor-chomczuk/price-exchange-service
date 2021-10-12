package com.lab604.priceexchangeservice.controller;

import com.lab604.priceexchangeservice.dto.PriceExchangeDTO;
import com.lab604.priceexchangeservice.dto.PriceResultDTO;
import com.lab604.priceexchangeservice.interfaces.IPriceExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceExchangeController {

    @Autowired
    private IPriceExchangeService priceExchangeService;

    @PostMapping("/exchange")
    public PriceResultDTO exchangePrice(@RequestBody PriceExchangeDTO priceExchangeDTO) {
        return priceExchangeService.exchange(priceExchangeDTO);
    }
}