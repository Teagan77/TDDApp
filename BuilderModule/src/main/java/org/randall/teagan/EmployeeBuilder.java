package org.randall.teagan;

public class EmployeeBuilder {

    private DefaultEmployeeBuilder defaultEmp = new DefaultEmployeeBuilder();

    public EmployeeBuilder(DefaultEmployeeBuilder defaultEmp){

    }

    public Employee getDefaultEmp(){
        return this.defaultEmp.getEmployee();
    }

    public void makeEmployee(){
        this.defaultEmp.buildID();
        this.defaultEmp.buildName();
        this.defaultEmp.buildSurname();
        this.defaultEmp.buildType();
    }
}
