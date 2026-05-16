package rockpaperscissors;


import java.util.Random;
import java.util.Scanner;

/*Rock paper scissor game
players - user, computer

*/
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //user instructions
        System.out.println("Choose one option:");
        System.out.println("1- Rock");
        System.out.println("2- Paper");
        System.out.println("3- Scissor");

        //user input
        System.out.println("Enter user choice: ");
        int userChoice = sc.nextInt();

        //computer random choice(1 to 3)
        int computerChoice = (int) Math.floor(Math.random()*3)+1;

        //show choices
        System.out.println("userChoice: "+getChoiceName(userChoice));
        System.out.println("computerChoice: "+getChoiceName(computerChoice));

        //Decide Winner
        if(userChoice==computerChoice){
            System.out.println("Result: It's a tie!");
        }else if((userChoice==1&&computerChoice==3)||
                (userChoice==2 && computerChoice==1)||
                (userChoice==3&&computerChoice==2)){
            System.out.println("result: User Wins!");

        }else{
            System.out.println("result: Computer Wins!");
        }
        sc.close();
    }
    public static String getChoiceName(int choice){
        switch (choice){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissor";
            default:
                return "Invalid choice!";
        }
    }
}
