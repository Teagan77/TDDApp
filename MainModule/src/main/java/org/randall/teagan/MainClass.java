package org.randall.teagan;

/**
 * Teagan Raandall 3b 215095111
 *
 */
public class MainClass
{
    public static void main( String[] args ){

        DefaultEmployeeBuilder defaultEmp = new DefaultEmployeeBuilder();
        EmployeeBuilder builder = new EmployeeBuilder(defaultEmp);

        builder.makeEmployee();

        Employee firstEmployee = builder.getDefaultEmp();

        System.out.println("Employee built:");
        System.out.println("Employee ID: " + firstEmployee.getId());
        System.out.println("Employee Name: " + firstEmployee.getName());
        System.out.println("Employee Surname: " + firstEmployee.getSurname());
        System.out.println("Employee Type: " + firstEmployee.getType());
    }
}
