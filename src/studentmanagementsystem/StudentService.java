package studentmanagementsystem;

import java.util.ArrayList;

public class StudentService {
    //collection to store student object
    private ArrayList<Student> studentList = new ArrayList<>();

    //add student
    public void addStudent(Student student) throws InvalidStudentDataException{
        studentList.add(student);
        if(student==null){
            System.out.println("Student object is null");
            return;
        }
        if(student.getMarks()<0){
            System.out.println("Marks cannot be negative");
            return;
        }
        if(student.getAttendance()<0||student.getAttendance()>100){
            System.out.println("Attendance must be between 0 to 100");
            return;
        }
        if(student.getFees()<0){
            System.out.println("Fees cannot be negative");
            return;
        }
//        studentList.add(student);
        System.out.println("Student added successfully!!");
    }

    //view all student
    public void viewAllStudent(){
        if(studentList.isEmpty()){
            System.out.println("No Student Records Found.");
            return;
        }else{
            for(Student s:studentList){
                System.out.println(s); //calls toString() method automatically
            }
        }
    }
    //Delete student by id
    public void deleteStudent(int id) throws StudentNotFound{
        boolean removed = false;
        for (Student s:studentList){
            if (s.getStudentId()==id){
                studentList.remove(s);
                removed = true;
                System.out.println("Student deleted successfully.");
                break;
            }
        }
        if (!removed){
            throw new StudentNotFound("Student with ID: "+ id+ " not found.");
        }

    }
    //update student marks, attendance, fees
    public boolean updateStudent(int id,int marks,int attendance,double fees)throws StudentNotFound{
        boolean found = false;
        for (Student s:studentList){
            if (s.getStudentId()==id){
                s.setMarks(marks);
                s.setAttendance(attendance);
                s.setFees(fees);
                found = true;
                System.out.println("Student updated successfully!");
                break;

            }
        }
        if (!found){
          throw new StudentNotFound("Student with ID: "+id+ " not found.") ;
        }
        return false;
    }
    
}
