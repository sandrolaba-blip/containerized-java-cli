
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    void customerStoresInformationCorrectly() {
        Customer customer = new Customer(
                "John Smith",
                "john@gmail.com",
                "555-123-4567"
        );

        assertEquals("John Smith", customer.getName());
        assertEquals("john@gmail.com", customer.getEmail());
        assertEquals("555-123-4567", customer.getPhone());
    }
}