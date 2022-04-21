package org.emp.java;

import org.client.java.Client;
import org.company.java.Company;
import org.project.Project;

public class Employee {
public void empName() {
	System.out.println("Employee Name is karthik");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee();
e.empName();
Company c=new Company();
c.companyName();
Client t=new Client();
t.clientName();
Project p=new Project();
p.projectNmae();
	}

}
