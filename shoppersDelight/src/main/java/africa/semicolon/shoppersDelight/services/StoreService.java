package africa.semicolon.shoppersDelight.services;

import africa.semicolon.shoppersDelight.dtos.request.StoreRegistrationRequest;
import africa.semicolon.shoppersDelight.dtos.response.StoreRegistrationResponse;

public interface StoreService {

    StoreRegistrationResponse register(StoreRegistrationRequest request);
}
