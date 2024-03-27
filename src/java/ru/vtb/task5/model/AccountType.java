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
@Entity(name = "tpp_ref_account_type")

public class AccountType {
    @Id
    private int id;

    @Column(name = "value")
    @NonNull
    private String value;
}
