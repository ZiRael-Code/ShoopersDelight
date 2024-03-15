package africa.semicolon.shoppersDelight.services;

import africa.semicolon.shoppersDelight.dtos.request.CustomerRegistrationRequest;
import africa.semicolon.shoppersDelight.dtos.request.UpdateCustomerRequest;
import africa.semicolon.shoppersDelight.dtos.response.ApiResponse;
import africa.semicolon.shoppersDelight.dtos.response.CustomerRegistrationResponse;
import africa.semicolon.shoppersDelight.dtos.response.UpdateCustomerResponse;
import africa.semicolon.shoppersDelight.exceptions.CustomerNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void registerTest(){
        CustomerRegistrationRequest request = new CustomerRegistrationRequest();
        request.setEmail("test@email.com");
        request.setPassword("password");

        CustomerRegistrationResponse response =
                customerService.register(request);

        assertNotNull(response);
        assertNotNull(response.getId());
    }

    @Test
    public void updateCustomerTest() throws CustomerNotFoundException {
        UpdateCustomerRequest request = new UpdateCustomerRequest();
        request.setEmail("john@email.com");
        request.setAddress("313, Herbert Macaulay way, Sabo-Yaba");

        ApiResponse<UpdateCustomerResponse> response =
                customerService.updateCustomer(2L, request);


        assertThat(response).isNotNull();
        assertThat(response.getData().getMessage()).isNotNull();

    }
}
