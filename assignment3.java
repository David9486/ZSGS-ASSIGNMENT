//1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
class Student{
	String name;
	int roll_no;
	public static void main(String[] args){
		Student s=new Student();
		s.name="DAVID";
		s.roll_no=1001;
		System.out.println("name: "+s.name);
		System.out.println("roll number: "+s.roll_no);
	}
}
//--------------------------------------------------------------------------------------------
//2. Create a class named Student that has the following attributes:
/*name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details
for two students having names "Sam" and "John" respectively.*/
class StudentTwo{
	String name;
	int roll_no;
	int phone_no;
	String address;
	public StudentTwo(String name,int roll_no,int phone_no,String address){
		this.name=name;
		this.roll_no=roll_no;
		this.phone_no=phone_no;
		this.address=address;
	}
	public static void main(String[] args){
		StudentTwo s1=new StudentTwo("Sam",1001,123,"Chennai");
		StudentTwo s2=new StudentTwo("john",1002,124,"Tirunelveli");
		System.out.println("name: "+s1.name);
		System.out.println("roll number: "+s1.roll_no);
		System.out.println("phone_no: "+s1.phone_no);
		System.out.println("address "+s1.address);
		System.out.println("name: "+s2.name);
		System.out.println("roll number: "+s2.roll_no);
		System.out.println("phone_no: "+s2.phone_no);
		System.out.println("address "+s2.address);
	}
}
//