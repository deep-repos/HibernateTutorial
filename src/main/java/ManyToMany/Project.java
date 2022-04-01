package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * 
 * Many project can have many employee
 * P1 has E1,E2,E3
 * P2 has E1,E2,E3
 * 
 * So Project class will have list of Employee
 * 
 * */

@Entity
public class Project {

	@Id
	private int project_id;
	
	private String project_name;
	
	
	@ManyToMany
	@JoinTable(name="e_id_project_id",
		joinColumns = {@JoinColumn(name="e_id_1")} , 
		inverseJoinColumns = {@JoinColumn(name="project_id_1")}
			
			)
	private List<Employee> list_of_employee;


	public int getProject_id() {
		return project_id;
	}


	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}


	public String getProject_name() {
		return project_name;
	}


	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}


	public List<Employee> getList_of_employee() {
		return list_of_employee;
	}


	public void setList_of_employee(List<Employee> list_of_employee) {
		this.list_of_employee = list_of_employee;
	}
	
	
	
	
	
	
}
