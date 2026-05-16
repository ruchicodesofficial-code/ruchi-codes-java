package markerinterface;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ravi");
        if(user instanceof PremiumUser){
            System.out.println("Premium features unlocked...");
        }else{
            System.out.println("Free user");
        }
    }
}
