package oops;
 //Example 3 of Encapsulation
class Employe {
	private int id;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String employePosition;
	
	
//get method for ID
	public int getId() {
		return id;
	}
//set method for ID
	public void setId(int id) {
		this.id = id;
	}

//get method for Name
	public String getName() {
		return name;
	}
//set method for Name
	public void setName(String name) {
		this.name = name;
	}

//get method for Address	
	public String getAddress() {
		return address;
	}
//set method for Address
	public void setAddress(String address) {
		this.address = address;
	}
	
//get method for PhoneNumber	
    public String getPhone() {
		return phone;
	}
//set method for PhoneNumber
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//get method For Email	
	public String getEmail() {
		return email;
	}
//set method For Email
	public void setEmail(String email) {
		this.email = email;
	}

//get method for EmpolyeePosition
	public String getEmployePosition() {
		return employePosition;
	}
//set method For EmpolyeePostion
public void setEmployePosition(String employePosition) {
		this.employePosition = employePosition;
	}

class EmployeMain{
     public static void main(String[] args) {
		Employe e = new Employe();
	
	e.setId(01);	
	e.setName("Vipin");
	e.setAddress("vangani");
	e.setEmail("xyz@gmail.com");
	e.setPhone("8888888888");
	e.setEmployePosition("manager");

	
	System.out.println("Employe Id:"+ e.getId());
	System.out.println("Employe name:"+ e.getName());
	System.out.println("Employe Address:"+ e.getAddress());
	System.out.println("Employe PhoneNo:"+ e.getPhone());
	System.out.println("Employe Position:"+ e.getEmployePosition());
	}

}
}