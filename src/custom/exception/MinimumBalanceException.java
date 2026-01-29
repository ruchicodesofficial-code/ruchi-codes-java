package custom.exception;

//custom checked exception
 class MinimumBalanceException extends Exception {
     public MinimumBalanceException(String message){
         super(message);
     }
}
