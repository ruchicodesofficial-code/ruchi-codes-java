package encapsulation;

/* create a bankAccount class
* account balance private
*     public methods
* withdraw money
* deposit money
* get the current balance
* Ensure that
* balance cannot be set directly
* withdrawal should not be allowed if balance is insufficient
*
* */

public class Student {
    private int age;
   //setter method
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
    }
    //getter method
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        System.out.println(s.getAge());
    }
}
