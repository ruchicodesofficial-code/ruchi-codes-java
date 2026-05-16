package studentmanagementsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService service = new StudentService();
    private LoginService loginService = new LoginService();

    public void startApp(){
        String role = chooseRole();
        //login for admin
        if (role.equals("ADMIN")){
            if(!loginUser()){
                System.exit(0);
            }
        }
        while(true){
            showMenu(role);
            try{
                int choice = sc.nextInt();
                if (role.equals("ADMIN")){
                switch (choice){
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        service.viewAllStudent();
                        break;
                    case 3 :
                        updateStudent();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                    case 5:
                        System.out.println("Application closed. Thank You!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please select again.");
                }
                }else{
                    //STUDENT ROLE
                    switch (choice){
                        case 1:
                            addStudent();
                            break;
                        case 2:
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice!");
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("Please enter numeric value only");
                sc.nextLine();//clear buffer
            }
        }
    }

    private boolean loginUser() {
        int attempts = 3;
        while (attempts>0){
            System.out.println("Enter username: ");
            String username = sc.next();

            System.out.println("Enter password: ");
            String password = sc.next();
            if (loginService.login(username,password)){
                System.out.println("Login successful!");
                return true;
            }else{
                attempts--;
                System.out.println("Invalid credentials. Attempts left: "+attempts);
            }
        }
        System.out.println("Too many failed attempts. Application Closed.");
        return false;
    }

    //choose role
    private String chooseRole(){
        System.out.println("\n Select Role: ");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.println("Enter you role: ");
        int roleChoice = sc.nextInt();
        if (roleChoice == 1){
            return "ADMIN";
        }
        else if(roleChoice==2){
            return "STUDENT";
        }
        else{
            System.out.println("Invalid role selected. Defaulting to student.");
            return "STUDENT ";
        }
    }
    //Menu display method
    private void showMenu(String role){
        System.out.println("\n----Student Management System----");
        if (role.equals("ADMIN")){
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
        }
        else{
            System.out.println("1. Add Student");
            System.out.println("2. Exit");
        }
        System.out.println("Enter your choice: ");
    }
    //Logic to add student
    private void addStudent(){
        try{
            System.out.println("Enter Student ID: ");
            int id = sc.nextInt();

            System.out.println("Enter Student Name: ");
            sc.nextLine();//buffer clear
            String name = sc.nextLine();

            System.out.println("Enter Marks: ");
            int marks = sc.nextInt();

            if(marks<0||marks>100){
                throw new InvalidStudentDataException("marks must be between 0 to 100");

            }
            System.out.println("Enter Attendance: ");
            int attendance = sc.nextInt();
            if(attendance<0||attendance>100){
                throw new InvalidStudentDataException("Attendance must be between 0 to 100");
            }
            System.out.println("Enter Fees");
            double fees = sc.nextDouble();
            if(fees<0){
                throw new InvalidStudentDataException("Fees cannot be negative");

            }
            Student student = new Student(id,name,marks,attendance,fees);
            service.addStudent(student);


        }catch (InvalidStudentDataException e){
            System.out.println("Validation error: "+e.getMessage());
        }
    }
    //delete
    private void deleteStudent(){
        try{
            System.out.println("Enter student ID to delete: ");
            int id = sc.nextInt();
            service.deleteStudent(id);
        }catch (StudentNotFound e){
            System.out.println("Error: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Invalid input. Please enter numeric value only.");
            sc.nextLine();
        }
    }
    //update
    private void updateStudent(){
        try{
            System.out.println("Enter student ID to update: ");
            int id = sc.nextInt();

            System.out.println("Enter new Marks: ");
            int marks = sc.nextInt();

            System.out.println("Enter new Attendance: ");
            int attendance = sc.nextInt();
            System.out.println("Enter new Fees: ");
            double fees = sc.nextDouble();
            service.updateStudent(id,marks,attendance,fees);
    }catch (Exception e){
            System.out.println("Invalid input.");
            sc.nextLine();
        }
    }
}
