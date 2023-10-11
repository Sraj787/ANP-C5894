package HibernatedemoEmployee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Emp_details")
public class Employee {
	
	@Id
	@Column(name="Emp_id")
	private int id;
	@Column(name="Name")
	private String emp_name;
	@Column(name="Department")
	private String emp_dept;
	@Column(name="Designation")
	private String emp_desig;
	@Column(name="Salary")
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public String getEmp_desig() {
		return emp_desig;
	}
	public void setEmp_desig(String emp_desig) {
		this.emp_desig = emp_desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", emp_dept=" + emp_dept + ", emp_desig=" + emp_desig
				+ ", salary=" + salary + "]";
	}
	
	
	



}
