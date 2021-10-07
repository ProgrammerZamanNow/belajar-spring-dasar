package programmerzamannow.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.repository.CustomerRepository;

@Component
public class CustomerService {

  @Getter
  @Autowired
  @Qualifier("normalCustomerRepository")
  private CustomerRepository normalCustomerRepository;

  @Getter
  @Autowired
  @Qualifier("premiumCustomerRepository")
  private CustomerRepository premiumCustomerRepository;
}
