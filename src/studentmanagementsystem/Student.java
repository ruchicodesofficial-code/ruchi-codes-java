package studentmanagementsystem;

public class Student {
    //instance variable
    private int studentId;
    private String studentName;
    private int marks;
    private int attendance;
    private double fees;
    //default constructor
    public Student(){

    }
    //parameterized constructor
    public Student(int studentId, String studentName, int marks, int attendance, double fees) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        this.attendance = attendance;
        this.fees = fees;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                ", attendance=" + attendance +
                ", fees=" + fees +
                '}';
    }
}
