package combinatorpattern;

import java.time.LocalDate;

/**
 * @author Ali Tofigh 3/16/2022 4:57 PM
 */

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+012154444",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
