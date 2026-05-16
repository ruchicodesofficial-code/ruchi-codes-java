package oops.association.onetomany;
import java.util.List;
public class Department {
    String deptName;
    List<Employee> employees;

    public Department(String deptName, List<Employee> employees) {
        this.deptName = deptName;
        this.employees = employees;
    }
   void showEmployees(){
       System.out.println("Department: "+deptName);
       for(Employee e:employees){
           System.out.println(e.id+" "+e.name);
       }
   }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
