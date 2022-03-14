package functionalinterface;

import java.util.function.Predicate;

/**
 * @author Ali Tofigh 3/13/2022 1:38 PM
 */

public class _Predicate {
 public static void main(String[] args) {
  System.out.println(validatePhoneNumber("07000000000"));
  System.out.println(validatePhoneNumber("070000000"));
  System.out.println(validatePhoneNumber("0900000000"));

  System.out.println("------------");
  System.out.println(validatePhoneNumberPredicate.test("07000000000"));
  System.out.println(validatePhoneNumberPredicate.test("070000000"));
  System.out.println(validatePhoneNumberPredicate.test("0900000000"));
  System.out.println("Is phone number valid and contain 3 ="
          + validatePhoneNumberPredicate.and(containsNumber3).test("07000000000"));
  System.out.println("Is phone number valid and contain 3 ="
          + validatePhoneNumberPredicate.and(containsNumber3).test("07000000300"));

 }

 static boolean validatePhoneNumber(String phoneNumber) {
  return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
 }

 static Predicate<String> validatePhoneNumberPredicate = phoneNumber ->
         phoneNumber.startsWith("07") && phoneNumber.length() == 11;

 static Predicate<String> containsNumber3 = phoneNumber ->
         phoneNumber.contains("3");
}
