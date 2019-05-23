package com.digi.accounting.model;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ConsumerAccount {

    @NonNull
    private String consumerId;
    @NonNull
    private BigDecimal balance;
    private BigDecimal orderValue;
}
