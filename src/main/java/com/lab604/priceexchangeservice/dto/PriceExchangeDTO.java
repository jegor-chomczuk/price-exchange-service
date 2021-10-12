package com.lab604.priceexchangeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PriceExchangeDTO {
    private Double priceInUSD;
    private String currency;
}
