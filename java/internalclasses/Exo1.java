// define a class 'Department 'thatt contains an inner class 'Employee' and an enumeration 'DepartmentType'
//implement serialization and deserialization of an instance of the 'Department' classs to a file called 'department.ser'

import java.io.*;

public class Exo1 {
    public static void main(String[] args) {
        // Create an instance of Department
        Department department = new Department("Human Resources", DepartmentType.HR);
        department.addEmployee("Yakoub");
        department.addEmployee("Mastigas:jsk");

        // Serialize the Department instance to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("department.ser"))) {
            oos.writeObject(department);
            System.out.println("Department serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the Department instance from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("department.ser"))) {
            Department deserializedDepartment = (Department) ois.readObject();
            System.out.println("Department deserialized successfully.");
            System.out.println(deserializedDepartment);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Department implements Serializable {
    private String name;
    private DepartmentType type;
    private Employee[] employees;
    private int employeeCount;

    public Department(String name, DepartmentType type) {
        this.name = name;
        this.type = type;
        this.employees = new Employee[10]; // Initial capacity for employees
        this.employeeCount = 0;
    }

    public void addEmployee(String employeeName) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = new Employee(employeeName);
        } else {
            System.out.println("Employee limit reached.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department Name: ").append(name).append("\n");
        sb.append("Department Type: ").append(type).append("\n");
        sb.append("Employees:\n");
        for (int i = 0; i < employeeCount; i++) {
            sb.append("- ").append(employees[i].getName()).append("\n");
        }
        return sb.toString();
    }

    private static class Employee implements Serializable {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

enum DepartmentType {
    HR, IT, SALES, MARKETING
}
