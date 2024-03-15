package africa.semicolon.shoppersDelight.services;

import africa.semicolon.shoppersDelight.dtos.request.StoreRegistrationRequest;
import africa.semicolon.shoppersDelight.dtos.response.StoreRegistrationResponse;
import africa.semicolon.shoppersDelight.models.Store;
import africa.semicolon.shoppersDelight.repositories.StoreRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppStoreService implements StoreService{
    @Autowired
    private StoreRepository storeRepository;
    ModelMapper mapper = new ModelMapper();
    @Override
    public StoreRegistrationResponse register(StoreRegistrationRequest request) {
        Store store = mapper.map(request,Store.class);
        store = storeRepository.save(store);
        StoreRegistrationResponse response = new StoreRegistrationResponse();
        response.setId(store.getId());
        return response;
    }
}
