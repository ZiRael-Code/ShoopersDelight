package africa.semicolon.shoppersDelight.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class Store {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String companyName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
