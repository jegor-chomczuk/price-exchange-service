package com.lab604.priceexchangeservice.interfaces;

import com.lab604.priceexchangeservice.dto.PriceExchangeDTO;
import com.lab604.priceexchangeservice.dto.PriceResultDTO;

public interface IPriceExchangeService {
    PriceResultDTO exchange(PriceExchangeDTO priceExchangeDTO);
}
