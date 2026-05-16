package studentManagementSystem.controller;

import studentManagementSystem.model.Student;
import studentManagementSystem.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService service = new StudentService();

    public void start(){
        while (true){
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            handleChoice(choice);
        }
    }
    private void showMenu(){
        System.out.println("====================STUDENT MANAGEMENT SYSTEM=========================");
        System.out.println("1. Add student");
        System.out.println("2. View all student");
        System.out.println("3. Search by ID");
        System.out.println("4. Search by Name");
        System.out.println("5. Update student");
        System.out.println("6. Delete student");
        System.out.println("7. Sort by marks");
        System.out.println("8. Exit");
        System.out.println("Enter Choice: ");

    }
    private void handleChoice(int choice){
        switch (choice){
            case 1:
                addStudent();
                break;
            case 2:
                service.viewAllStudent();
                break;
            case 3:
                System.out.println("Enter ID: ");
                service.searchById(sc.nextInt());
                break;
            case 4:
                System.out.println("Enter Name: ");
                service.searchByName(sc.nextLine());
                break;
            case 5:
                updateStudent();
                break;
            case 6:
                System.out.println("Enter ID: ");
                service.deleteStudent(sc.nextInt());
                break;
            case 7:
                service.shortByMarks();
                break;
            case 8:
                System.out.println("Exit");
                System.exit(0);
            default:
                System.out.println("Invalid choice.......");
        }
    }

    private void addStudent(){
        System.out.println("ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Course: ");
        String course = sc.nextLine();

        System.out.println("Marks: ");
        double marks = sc.nextDouble();

        service.addStudent(new Student(id,name,age,course,marks));
    }
    private void updateStudent(){
        System.out.println("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Course: ");
        String course = sc.nextLine();

        System.out.println("Marks: ");
        double marks = sc.nextDouble();

        service.updateStudent(new Student(id,name,age,course,marks));
    }
}
