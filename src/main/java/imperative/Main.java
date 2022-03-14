package imperative;

import cls.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static cls.Gender.FEMALE;
import static cls.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
          new Person("John", MALE),
          new Person("Maria", FEMALE),
          new Person("Alisha", FEMALE),
          new Person("Alex", MALE),
          new Person("Alice", FEMALE)
        );

        System.out.println("//Imperative approach");
        //Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.getGender()))
                females.add(person);
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("//Declarative approach");
        //Declarative approach
        people.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
