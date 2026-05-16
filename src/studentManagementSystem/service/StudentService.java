package studentManagementSystem.service;

import studentManagementSystem.dao.StudentDAO;
import studentManagementSystem.dao.StudentDAOImpl;
import studentManagementSystem.model.Student;

import java.util.Comparator;
import java.util.List;

public class StudentService {
    StudentDAO dao = new StudentDAOImpl();

    public void addStudent(Student s){
        if(s.getAge()<=0||s.getName().isEmpty()){
            System.out.println("Invalid Data");
            return;
        }
        if(dao.getStudentById(s.getId())!=null){
            System.out.println("Id already exists!");
            return;
        }
        dao.addStudent(s);
    }

    public void viewAllStudent(){
        List<Student> list = dao.getAllStudents();
        if(list.isEmpty()){
            System.out.println("No Data Found!");
            return;
        }
        for(Student s:list){
            System.out.println(s);
        }
    }
    public void searchById(int id){
        Student s = dao.getStudentById(id);
        if(s==null){
            System.out.println("Not Found");
        }else{
            System.out.println("\nID | Name | Age | Course | Marks");
            System.out.println(s);

        }    }
    public void searchByName(String name){
        List<Student> list = dao.searchByName(name);
        if(list.isEmpty()){
            System.out.println("No matching record found!!");
            return;
        }else{
            System.out.println("\nID | Name | Age | Course | Marks");
            list.forEach(System.out::println);
        }
    }

    public void updateStudent(Student s){
        if(dao.getStudentById(s.getId())==null){
            System.out.println("Student not found!!");
            return;
        }
        dao.updateStudent(s);
    }

    public void deleteStudent(int id){
        if(dao.getStudentById(id)==null){
            System.out.println("Student not found!!");
            return;
        }
        dao.deleteStudent(id);

    }

    public void shortByMarks(){
        List<Student> list = dao.getAllStudents();
        if(list.isEmpty()){
            System.out.println("No data found!");
            return;
        }
        list.sort(Comparator.comparingDouble(Student::getMarks).reversed());
        list.forEach(s->
                System.out.println(s.getName()+ " | "+s.getMarks()));
    }
}
