package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program Started");
     try {
         int a = 0;
         int b = 0;
         int result = a / b;
         System.out.println(result);
     }catch (Exception e){
         System.out.println("Cannot divide by zero");
     }finally {
         System.out.println("Finally block always execute");
     }
        System.out.println("finished");
    }
}
