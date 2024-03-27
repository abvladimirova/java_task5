package ru.vtb.task5.model;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "Account")
public class Account {
    @Id
    private int id;

    @Column(name = "account_number")
    private String accountNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE}) // TODO проверить связь
    @JoinColumn(name = "account_pool_id")
    private AccountPool pool;
}
