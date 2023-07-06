package oops;

class Student {
	private int rollno;
	private String name;
	private int age;
	private String address;
	
	//Get for RollNo
	public int getRollno() {
		return rollno;
	}
	//Set for RollNo
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	//Get for Name
	public String getName() {
		return name;
	}
	//Set for Name
	public void setName(String name) {
		this.name = name;
	}
	
	//Get for Age
	public int getAge() {
		return age;
	}
	//Set for Age
	public void setAge(int age) {
		this.age = age;
	}
	
	//Get for Address
	public String getAddress() {
		return address;
	}
	//Set for Address
	public void setAddress(String address) {
		this.address = address;
	}
	
class StudentMain{
	public static void main(String[] args) {
		Student d = new Student();
		d.setRollno(5);
		d.setName("Sarthak");
		d.setAge(23);
		d.setAddress("Shelu");
	
System.out.println("Roll No :"+ d.rollno);
System.out.println("Student Name :" + d.getName());
System.out.println("Age :"+ d.age);
System.out.println("Student Address :"+d.getAddress());
		
	}
}


}
