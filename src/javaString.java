import java.util.Scanner;

public class javaString {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // take input as String
                System.out.print("Enter number: ");
                String input = sc.nextLine();

                // convert to int
                int num = Integer.parseInt(input);

                // use it
                System.out.println("You entered: " + num);
                System.out.println("After adding 5: " + (num + 5));

                sc.close();
            }
        }
