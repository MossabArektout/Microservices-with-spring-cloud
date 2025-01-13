package com.mossab.customerservice;

import com.mossab.customerservice.entities.Customer;
import com.mossab.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
//        return args -> {
//            // Utilisation du constructeur pour créer les clients
//            Customer customer1 = new Customer("Mossab", "Arektout", "arektout@gmail.com");
//            customerRepository.save(customer1);
//
//            Customer customer2 = new Customer("Souhaib", "Arektout", "soso@gmail.com");
//            customerRepository.save(customer2);
//        };
        return args -> {
            Customer customer1 = Customer.builder()
                    .firstName("Mossab")
                    .lastName("Arektout")
                    .email("arektout@gmail.com")
                    .build();
            customerRepository.save(customer1);

            Customer customer2 = Customer.builder()
                    .firstName("Souhaib")
                    .lastName("Arektout")
                    .email("soso@gmail.com")
                    .build();
            customerRepository.save(customer2);
        };
    }
}
