package com.mossab.customerservice.web;


import com.mossab.customerservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
    private CustomerRepository customerRepository;

}
