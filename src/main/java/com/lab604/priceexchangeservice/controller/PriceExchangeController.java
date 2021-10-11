package com.lab604.priceexchangeservice.controller;

import com.lab604.priceexchangeservice.dto.PriceExchangeDTO;
import com.lab604.priceexchangeservice.interfaces.IPriceExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange")
public class PriceExchangeController {

    @Autowired
    private IPriceExchangeService priceExchangeService;

    @GetMapping
    public Double exchangePrice(@RequestBody PriceExchangeDTO priceExchangeDTO){
        return priceExchangeService.exchange(priceExchangeDTO);
    }
}