package com.mossab.accountservice;

import com.mossab.accountservice.entities.BankAccount;
import com.mossab.accountservice.enums.AccountType;
import com.mossab.accountservice.repository.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(BankAccountRepository bankAccountRepository) {
        return args -> {
            BankAccount bankAccount1 = BankAccount.builder()
                    .accountId(UUID.randomUUID().toString())
                    .currency("MAD")
                    .balance(98000.00)
                    .createdAt(LocalDate.now())
                    .type(AccountType.CURRENT_ACCOUNT)
                    .customerId(Long.valueOf(1))
                    .build();
            BankAccount bankAccount2 = BankAccount.builder()
                    .accountId(UUID.randomUUID().toString())
                    .currency("MAD")
                    .balance(12000.00)
                    .createdAt(LocalDate.now())
                    .type(AccountType.SAVINGS_ACCOUNT)
                    .customerId(Long.valueOf(2))
                    .build();
            bankAccountRepository.save(bankAccount1);
            bankAccountRepository.save(bankAccount2);
        };
    }
}
