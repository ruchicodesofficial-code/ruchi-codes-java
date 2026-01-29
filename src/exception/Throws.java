package exception;

public class Throws {
    static void divide() throws ArithmeticException{
        int a = 10/0;
    }
    public static void main(String[] args) {
        try {
            divide();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("completed");
    }
}
