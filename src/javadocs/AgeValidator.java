package javadocs;

/**AgeValidator class is used to validate user age
 *
 * @author ruchi
 * @version 1.0
 */
public class AgeValidator {

/**
 * Validate the given age
 * This method return {@code true} if the age
 * is{@literal >=18}. Otherwise, it throws an exception
 * @param age age entered by user
 * @return {@code true} if age is valid
 * @throws IllegalArgumentException if{@code age } is negative
 * @throws ArithmeticException if{@code age} is less than 18
 * */

    public boolean validateAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative!");
        }if(age<18){
            throw new ArithmeticException("User is underage");
        }
        return true;
    }
    /**
     * Calls {@link #validateAge(int)} method to check
     * whether the user is eligible or not
     * @param age age entered by user
     * */
    public void checkEligibility(int age){
        validateAge(age);
    }
    public static void main(String[] args) {

    }
}
