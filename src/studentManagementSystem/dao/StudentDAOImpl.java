package studentManagementSystem.dao;

import studentManagementSystem.model.Student;
import studentManagementSystem.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    Connection con =  DBConnection.getConnection();;
    //Insert
    public void addStudent(Student s){
        try{
           String query = "INSERT INTO student VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,s.getId());
            ps.setString(2,s.getName());
            ps.setInt(3,s.getAge());
            ps.setString(4,s.getCourse());
            ps.setDouble(5,s.getMarks());
            ps.executeUpdate();
            System.out.println("Student added successfully!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //SELECT

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        try{
            String query = "SELECT * FROM student";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               list.add(new Student(
                       rs.getInt("id"),
                       rs.getString("name"),
                       rs.getInt("age"),
                       rs.getString("course"),
                       rs.getDouble("marks")
               ));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    //getStudentById
    public Student getStudentById(int id){
        try{
            String query = "SELECT * FROM student WHERE id =?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getDouble("marks")
                );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //searchByName
    public List<Student> searchByName(String name){
        List<Student>list = new ArrayList<>();
        try{
            String query = "SELECT * FROM student WHERE name LIKE ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,"%"+name+"%");
            ResultSet rs  = ps.executeQuery();
            while (rs.next()){
                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getDouble("marks")
                ));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    // update
    public void updateStudent(Student s){
        try{

            String query = "UPDATE student SET name = ?, age =?,course=?,marks =? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, s.getName());
            ps.setInt(2,s.getAge());
            ps.setInt(3,s.getId());
            ps.setString(4,s.getCourse());
            ps.setDouble(5,s.getMarks());
            ps.executeUpdate();
            System.out.println("Student updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // delete
    public void deleteStudent(int id){
        try{
            String query = "DELETE FROM student WHERE id =?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Student deleted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
