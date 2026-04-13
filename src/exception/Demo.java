package exception;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in)
        ){
            System.out.println("Enter number: ");
            int x = sc.nextInt();
            System.out.println(x);
        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}
