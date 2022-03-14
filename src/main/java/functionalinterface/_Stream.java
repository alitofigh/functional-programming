package functionalinterface;

import cls.Person;

import java.util.List;
import java.util.stream.Collectors;

import static cls.Gender.FEMALE;
import static cls.Gender.MALE;

/**
 * @author Ali Tofigh 3/13/2022 7:09 PM
 */

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Alisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        people.stream()
                .map(Person::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
