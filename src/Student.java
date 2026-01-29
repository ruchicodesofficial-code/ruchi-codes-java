public class Student {
    int id;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    Student (){
        this(10);
        System.out.println("Default constructor");
    }
    Student(int a){
        System.out.println("Parameterized constructor");
    }
    void show(){
        System.out.println("Show method");
    }
     void details(){
        this.show();
    }

    public static void main(String[] args) {
        Student st = new Student(1,"ruchi");
        st.show();
        Student a = new Student(10);


    }
   }
