package org.randall.teagan;

/**
 * Teagan Randall 3b 215095111
 *
 */

public class Employee implements EmployeeService{

    private int id;
    private String name;
    private String surname;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }
}