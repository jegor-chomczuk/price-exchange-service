package com.lab604.priceexchangeservice.services;

import com.lab604.priceexchangeservice.dto.PriceExchangeDTO;
import com.lab604.priceexchangeservice.interfaces.IPriceExchangeService;
import org.springframework.stereotype.Service;

@Service
public class PriceExchangeService implements IPriceExchangeService {

    public Double exchange(PriceExchangeDTO priceExchangeDTO){
        String currency = priceExchangeDTO.getCurrency().toString();
        Double result = priceExchangeDTO.getPriceInUSD();
        switch (currency){
            case "EUR":
                result *= 0.86;
                break;
            case "PLN":
                result *= 3.97;
                break;
            case "GBP":
                result *= 0.73;
                break;
        }
        return result;
    }
}
