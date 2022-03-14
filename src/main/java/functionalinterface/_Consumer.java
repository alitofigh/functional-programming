package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author Ali Tofigh 3/13/2022 8:15 AM
 */

public class _Consumer {
    public static void main(String[] args) {
        Customer john = new Customer("John", "9999999");
        greetCustomer(john);
        greetingCustomerByConsumer.accept(john);
        greetingCustomerByConsumerV2.accept(john, false);
    }

    static BiConsumer<Customer, Boolean> greetingCustomerByConsumerV2 = (customer, showPhoneNumber) -> {
        System.out.println("Hello " + customer.name
                + ", thanks for registering phone number: " +
                (showPhoneNumber ? customer.phoneNumber : "**********"));
    };

    static Consumer<Customer> greetingCustomerByConsumer = customer -> {
        System.out.println("Hello " + customer.name
                + ", thanks for registering phone number: " + customer.phoneNumber);
    };

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name
                + ", thanks for registering phone number: " + customer.phoneNumber);
    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
