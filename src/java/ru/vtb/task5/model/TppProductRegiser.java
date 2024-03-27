package ru.vtb.task5.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "tpp_product_register")

public class TppProductRegiser {
    @Id
    private int id;

    @Column(name = "product_id")
    private BigInteger product;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE}) // TODO проверить связь
    @JoinColumn(name = "type")
    private PoductRegisterType type;

    @Column(name = "currency_code")
    private String currency;

    @Column(name = "account_number")
    private String account;
}
