package com.lab604.priceexchangeservice.services;

import com.lab604.priceexchangeservice.dto.PriceExchangeDTO;
import com.lab604.priceexchangeservice.dto.PriceResultDTO;
import com.lab604.priceexchangeservice.interfaces.IPriceExchangeService;
import org.springframework.stereotype.Service;

@Service
public class PriceExchangeService implements IPriceExchangeService {

    public PriceResultDTO exchange(PriceExchangeDTO priceExchangeDTO) {
        String currency = priceExchangeDTO.getCurrency();
        Double result = priceExchangeDTO.getPriceInUSD();
        switch (currency) {
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
        PriceResultDTO priceResultDTO = new PriceResultDTO();
        priceResultDTO.setPriceInCurrency(result);
        return priceResultDTO;
    }
}
