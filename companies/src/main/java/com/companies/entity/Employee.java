package com.companies.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private static int counter = 0;

    public Employee() {}

    public Employee(String firstName, String lastName, int salary ) {
        id = counter++;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', salary='%s']",
                id, firstName, lastName, salary);
    }
    
    public int getID()
    {
    	return id;
    }
    
    
    public String getFirstName()
    {
    	return firstName;
    }

    public String getLastName()
    {
    	return lastName;
    }
    
    public int getSalary()
    {
    	return salary;
    }
    
    public void setID()
    {
    	this.id = counter++;
    }
    
    public void setFirstName(String firstName)
    {
    	this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
    	this.lastName = lastName;
    }
    
    public void setSalary(int salary)
    {
    	this.salary = salary;
    }
}