package com.mossab.accountservice.entities;

import com.mossab.accountservice.enums.AccountType;
import com.mossab.accountservice.model.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @ToString @NoArgsConstructor
@AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String accountId;
    private Double balance;
    private LocalDate createdAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    private Long customerId;
    @Transient               // ignore cette attribut, c-a-d c'est un attribut qui existe dans la classe mais pas au niveau de la base de donnes
    private Customer customer;
}
