package customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;

    public Customer() {
    }

}
