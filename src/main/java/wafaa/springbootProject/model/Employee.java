package wafaa.springbootProject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Employee {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "employee")
	private int id;
	private String name;
	private String email;
	private String job;
	private String dept;
	private String phone;
	private String salary;
	private Date dateemb;
	private Date dateN;

	
	

	public Employee() {
	}
	public Employee(int id, String name, String email, String job, String dept, String phone, String salary,
			Date dateemb, Date dateN) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.job = job;
		this.dept = dept;
		this.phone = phone;
		this.salary = salary;
		this.dateemb = dateemb;
		this.dateN = dateN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateemb() {
		return dateemb;
	}
	public void setDateemb(Date dateemb) {
		this.dateemb = dateemb;
	}
	public Date getDateN() {
		return dateN;
	}
	public void setDateN(Date dateN) {
		this.dateN = dateN;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}


	
	
	

}
