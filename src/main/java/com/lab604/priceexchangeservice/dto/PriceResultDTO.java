package com.lab604.priceexchangeservice.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PriceResultDTO {
    @NonNull
    private Double priceInCurrency;
}
