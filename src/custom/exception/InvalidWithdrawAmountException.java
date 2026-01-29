package custom.exception;

//custom unchecked exception
public class InvalidWithdrawAmountException extends RuntimeException{
    public InvalidWithdrawAmountException(String message){
        super(message);
    }
}
