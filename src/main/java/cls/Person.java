package cls;

import imperative.Main;

/**
 * @author Ali Tofigh 3/13/2022 7:10 PM
 */

public class Person {
 private final String name;
 private final Gender gender;

 public Person(String name, Gender gender) {
  this.name = name;
  this.gender = gender;
 }

 public String getName() {
  return name;
 }

 public Gender getGender() {
  return gender;
 }

 @Override
 public String toString() {
  return "Person{" +
          "name='" + name + '\'' +
          ", gender=" + gender +
          '}';
 }
}
