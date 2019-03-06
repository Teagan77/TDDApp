package org.randall.teagan;

public class DefaultEmployeeBuilder implements BuilderService{

    private Employee employee;

    public DefaultEmployeeBuilder(){
        this.employee = new Employee();
    }

    @Override
    public void buildID() {
        employee.setID(0);
    }

    @Override
    public void buildName() {
        employee.setName("Default");
    }

    @Override
    public void buildSurname() {
        employee.setSurname("User");
    }

    @Override
    public void buildType() {
        employee.setType("Office Drone");
    }

    @Override
    public Employee getEmployee() {
        return this.employee;
    }
}
