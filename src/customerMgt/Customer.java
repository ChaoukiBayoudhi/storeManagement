package customerMgt;

import Enumerations.CustomerType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Customer {
    private long id;
    private static long lastId=0;
    @EqualsAndHashCode.Include
    private String firstName;
    @EqualsAndHashCode.Include
    private String lastName;
    @EqualsAndHashCode.Include
    private String email;
    private String telephoneNumber;//00332145
    private String address;
    private CustomerType type;

    public Customer() {
        this.id=++lastId;
    }

    public Customer(String firstName, String lastName, String email, String telephoneNumber, String address, CustomerType type) {
        this.id=++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.type = type;
    }

}

