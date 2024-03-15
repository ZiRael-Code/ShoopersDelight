package africa.semicolon.shoppersDelight.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StoreRegistrationRequest {
    private String companyName;
    private String email;
    private String password;
}
