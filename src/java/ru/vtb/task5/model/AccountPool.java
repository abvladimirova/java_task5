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

@Entity
public class AccountPool {
    @Id
    private Integer id;

    @Column(name = "branch_code")
    private String branch;

    @Column(name = "currency_code")

    private String currency;

    @Column(name = "mdm_code")

    private String mdmCode;

    @Column(name = "priority_code")
    private String priority;

    @Column(name = "registry_type_code")
    private String registerType;
}
