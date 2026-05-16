package objectclass;

public class Student {
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object obj){
//        //same reference check
//        if(this==obj) return  true;
//        //null check
//        if(obj==null) return false;
//        //class check
//        if(this.getClass()!=obj.getClass()) return false;
//        //type casting
//        Student s = (Student) obj;
//        //Logical comparison
//        return this.id==s.id;
//    }
//    @Override
//    public int hashCode(){
//        return id;
//    }

    public static void main(String[] args) {
//        Student s = new Student();
//        s.id = 101;
//        s.name = "Rahul";
//        System.out.println(s);
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 101;
        s2.id = 101;
//        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
