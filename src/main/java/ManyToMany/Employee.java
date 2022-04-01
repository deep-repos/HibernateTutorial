package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * 
 *  Many Employee can work in many project
 * E1 works in p1,p2,p3
 * E2 works in p1,p2,p3
 * 
 * so Employee class  will have list of project
 * 
 * 
 * 
 **/

@Entity
public class Employee {
	@javax.persistence.Id
	private int e_id;
	
	private String employee_name;
	
	
	@ManyToMany(mappedBy = "list_of_employee")
	private List<Project> list_of_project;


	public int getE_id() {
		return e_id;
	}


	public void setE_id(int e_id) {
		this.e_id = e_id;
	}


	public String getEmployee_name() {
		return employee_name;
	}


	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}


	public List<Project> getList_of_project() {
		return list_of_project;
	}


	public void setList_of_project(List<Project> list_of_project) {
		this.list_of_project = list_of_project;
	}
	
	
	
	
}
