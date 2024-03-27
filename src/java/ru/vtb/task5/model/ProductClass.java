package ru.vtb.task5.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "tpp_ref_product_class")

public class ProductClass {
    @Id
    private int id;

    @Column(name = "value")
    @NonNull
    private String value;

    @Column(name = "gbi_code")
    private String gbiCode;

    @Column(name = "gbi_name")

    private String gbiName;

    @Column(name = "product_row_code")
    private String rowCode;

    @Column(name = "product_row_name")
    private String rowName;

    @Column(name = "subclass_code")
    private String subclassCode;

    @Column(name = "subclass_name")
    private String subclassName;
}
