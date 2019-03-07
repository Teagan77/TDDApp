package org.randall.teagan;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DefaultEmployeeBuilderTest {

    DefaultEmployeeBuilder defaultEmp = new DefaultEmployeeBuilder();
    EmployeeBuilder builder = new EmployeeBuilder(defaultEmp);

    //Employee firstEmployee = builder.getDefaultEmp();
    @Test
    public void buildID() {
        builder.makeEmployee();
        assertEquals("A default employee will have an ID of '0'.", true, builder.getDefaultEmp().getId() == 0);
    }

    @Test
    public void buildName() {
        builder.makeEmployee();
        assertEquals("A default employee will have the name 'Default'.", true, builder.getDefaultEmp().getName().equals("Default"));

    }

    @Test
    public void buildSurname() {
        builder.makeEmployee();
        assertEquals("A default employee will have the surname 'User'.", true, builder.getDefaultEmp().getSurname().equals("User"));

    }

    @Test
    public void buildType() {
        builder.makeEmployee();
        assertEquals("A default employee will have a type of 'Office Drone'.", true, builder.getDefaultEmp().getType().equals("Office Drone"));
    }

    @Test
    public void getEmployee() {
        builder.makeEmployee();
        assertEquals("Will return an instance of employee.", true, builder.getDefaultEmp() instanceof Employee);
    }
}