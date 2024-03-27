package ru.vtb.task5.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "tpp_ref_product_register_type")

public class PoductRegisterType {
    @Id
    private int id;

    @Column(name = "value")
    private String value;

    @Column(name = "register_type_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE}) // TODO проверить связь
    @JoinColumn(name = "product_class_code")
    private ProductClass productClass;

    @Column(name = "register_type_start_date")
    private Timestamp startDate;

    @Column(name = "register_type_end_date")
    private Timestamp endDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE}) // TODO проверить связь
    @JoinColumn(name = "account_type")
    private AccountType accountType;
}
