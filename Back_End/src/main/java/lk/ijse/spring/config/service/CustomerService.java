package lk.ijse.spring.config.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

     void addCustomer(CustomerDTO dto);

     void deleteCustomer(String id);

     List<CustomerDTO> getAllCustomer();

     CustomerDTO findCustomer(String id);

     void updateCustomer(CustomerDTO c);
}
