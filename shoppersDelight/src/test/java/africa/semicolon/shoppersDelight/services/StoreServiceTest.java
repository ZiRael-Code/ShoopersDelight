package africa.semicolon.shoppersDelight.services;

import africa.semicolon.shoppersDelight.dtos.request.StoreRegistrationRequest;
import africa.semicolon.shoppersDelight.dtos.response.StoreRegistrationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class StoreServiceTest {
   @Autowired
    StoreService storeService;
    @Test
    void registerTest(){
        StoreRegistrationRequest request = new StoreRegistrationRequest();
        request.setCompanyName("shopperDelight");
        request.setEmail("shoppersDelight@gmail.com");
        request.setPassword("password");

        StoreRegistrationResponse response = storeService.register(request);
        assertNotNull(response);
        assertNotNull(response.getId());
    }

    @Test
    void addProductTest(){

    }

}
