package com.lab604.priceexchangeservice.interfaces;

import com.lab604.priceexchangeservice.dto.PriceExchangeDTO;

public interface IPriceExchangeService {
    Double exchange(PriceExchangeDTO priceExchangeDTO);
}
