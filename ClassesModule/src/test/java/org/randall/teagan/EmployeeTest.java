package org.randall.teagan;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Unit test for simple Employee.
 */
public class EmployeeTest
{

    Employee fisrtEmp = new Employee();

    @Test
    public void setName(){
        fisrtEmp.setName("Jeff");
        assertEquals("The employee's name is set to 'Jeff'.", true, fisrtEmp.getName().equals("Jeff"));
    }

    @Test
    public void setSurname() {
        fisrtEmp.setSurname("Stevens");
        assertEquals("The employee's surname is set to 'Stevens'.", true, fisrtEmp.getSurname().equals("Stevens"));
    }

    @Test
    public void setID() {
        fisrtEmp.setID(215095111);
        assertEquals("The employee's ID is set to '215095111'.", true, fisrtEmp.getId() == 215095111);
    }

    @Test
    public void setType(){
        fisrtEmp.setType("Office Drone");
        assertEquals("The employee's type is set to 'Office Drone'.", true, fisrtEmp.getType().equals("Office Drone"));
    }
}
