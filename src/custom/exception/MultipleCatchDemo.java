package custom.exception;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try{
            //Arithmetic Exception
            int a = 10/0;
            System.out.println(a);
            // Array Index out of bound Exception
            int[] arr = new int[3];
            System.out.println(arr[5]);
            //null pointer exception
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: Cannot divide by zero");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" ArrayIndexOutOfBoundException: Invalid index ");

        }catch (NullPointerException e){
            System.out.println("NullPointerException: Null value access");

        }finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program Ended");

    }
}
