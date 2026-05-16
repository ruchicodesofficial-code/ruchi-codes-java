package studentmanagementsystem;

public class LoginService {
    private final String USERNAME = "admin";
    private  final String PASSWORD = "admin1234";

    public boolean login(String username, String password){
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
