package com.lab604.priceexchangeservice.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PriceDTO {
    @NonNull
    private Double price;
    @NonNull
    private String currency;
}
