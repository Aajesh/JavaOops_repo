import com.aajesh.pojo.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setValues("Aajesh", "Burhanpur");

        System.out.println("Employee Name : "+employee.getName());
        System.out.println("Employee address : "+employee.getAddress());
    }
}