package in.pwskills.atif.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	

	public Employee() {
		System.out.println("Object created by framework....");
	}
	
	static {
		System.out.println("Employee.class file is loading");
	}


	public Integer getEid() {
		System.out.println("Employee.getEid()");
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
		System.out.println("Employee.setEid()");
	}


	public String getFirstName() {
		System.out.println("Employee.getFirstName()");
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("Employee.setFirstName()");
	}


	public String getLastName() {
		System.out.println("Employee.getLastName()");
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("Employee.setLastName()");
	}


	public String getEmail() {
		System.out.println("Employee.getEmail()");
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
		System.out.println("Employee.setEmail()");
	}


	public String getAddress() {
		System.out.println("Employee.getAddress()");
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
	}


	@Override
	public String toString() {
		System.out.println("Employee.toString()");
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + "]";
	}
	
	
	
}
