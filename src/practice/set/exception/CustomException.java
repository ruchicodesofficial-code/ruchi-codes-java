package practice.set.exception;

public class CustomException
{static  void checkAge(int age) throws InvalidAgeException{
    if(age<18){
        throw new InvalidAgeException("Age is invalid.");
    }else{
        System.out.println("Age is valid.");
    }
}
    public static void main(String[] args) {
        System.out.println("Program started");
    try{
        checkAge(16);
    } catch (InvalidAgeException e) {
        System.out.println("Exception caught: "+e.getMessage());
    }
        System.out.println("program ended");

    }
}
