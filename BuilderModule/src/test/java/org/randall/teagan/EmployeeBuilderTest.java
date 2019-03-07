package org.randall.teagan;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeBuilderTest {

    private DefaultEmployeeBuilder defaultEmp = new DefaultEmployeeBuilder();

    @Test
    public void getDefaultEmp() {
        assertEquals("Will return an Employee.", true, defaultEmp.getEmployee() instanceof Employee);
    }

    @Test
    public void makeEmployee() {
        defaultEmp.buildID();
        defaultEmp.buildName();
        defaultEmp.buildSurname();
        defaultEmp.buildType();

        Employee firstEmp = defaultEmp.getEmployee();
        boolean hasDefaultValues = false;

        if(firstEmp.getId() == 0 && firstEmp.getName().equals("Default") && firstEmp.getSurname().equals("User") && firstEmp.getType().equals("Office Drone")){
            hasDefaultValues = true;
        }
        assertEquals("Will populate employee wil default values.", true, hasDefaultValues);
    }
}