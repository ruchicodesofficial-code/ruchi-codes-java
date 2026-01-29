package practice.set.exception;

public class AgeCheck {
    public static void main(String[] args) {
        int age = 16;
        if(age <0){
            System.out.println("Enter valid input");
        }
        else if(age<18){
            throw new ArithmeticException("Not eligible");

        }else{
            System.out.println("Eligible");
        }
    }
}
