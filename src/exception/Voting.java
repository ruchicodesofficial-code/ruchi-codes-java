package exception;

public class Voting {
    static  void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible for voting");
        }
        System.out.println("Eligible for voting");
    }
    public static void main(String[] args) {

        try{
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("checked");

    }
}
