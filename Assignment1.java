import java.util.Scanner;

class Variables{
	int instanceVariables;	//this is instance Variable
	static int staticVariable; 	//this is static Variable
	
	
public static void main(String[] args){//this is main method
		final int finalVariable=12345;   //this is final variable 
		Variables vari=new Variables();
		vari.instanceVariables=123;
	    int localVariable=0;		//this is local Variable
		Variables.staticVariable=321;
		{
			int blockVariable=123;   //this block variable
			System.out.println("this is block variable: "+blockVariable);
		}
		
		System.out.println("this is final variable: "+finalVariable);
		System.out.println("this is static Variable: "+Variables.staticVariable);
		System.out.println("this is local Variable: "+localVariable);
		System.out.println("this is instance Variable:  "+vari.instanceVariables);
	
}
}


//2.Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.


class Datatypes{
	
	public static void main(String[] args){
		int integer=10000;   //this is a integer value
		float decimal=10.56f;   //this is a float value
		double double1=0.53436389;  //this is a double variable
		long Long1=982345678;   //this is a long variable
		char character='E';    //this is a character variable
		byte Byte1=12;        //this is a byte varaiable;
		
		System.out.println("this is a integer value: "+integer);
		System.out.println("this is a float value: "+decimal);
		System.out.println("this is a double variable: "+double1);
		System.out.println("this is a long variable: "+Long1);
		System.out.println("this is a character variable: "+character);
		System.out.println("this is a byte variable: "+Byte1);
	}
}
		
//3.Write a program to find the maximum of two numbers using ternary operator.


class Ternary{
	public static void main(String[] args){
		int a=10;
		int b=20;
		String result=a<b?"b is greater than":"is greater than ";
		System.out.println(result);
	}
}

//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
class EqualNumbers{
	public static void main(String[] args){
		int a=10;
		int b=10;
		String str=Integer.toString(a);
		String str1=Integer.toString(b);
		if(str.equals(str1)){
			System.out.print("the two numbers are equal");
		}
		else System.out.print("they are not equal");
	}
}

		

//6.Write a program that illustrate the Explicit type casting

class Casting{
	public static void main(String [] args){
		double a=10.5;    //this is a double variable
		int doubleToInt=(int)a;    //changing double to int
		System.out.println("double to int value: "+doubleToInt);
		
	}
}


// 7.Write a program that illustrate the execution order of static block and initializer block?


class Executions{
	{
		System.out.println("I'm instance");
	}
	static{
		System.out.println("I'm static");
	}
	public static void main(String[] args){
		Executions e=new Executions();
	}
}
		

//7.Write a program to check if a number is a power of 2?

class Power{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		long number=sc.nextLong();
		boolean flag=false;
		Long temp=2l;
		while(temp<=number){
			if(temp==number){
				flag=true;	
			}
			temp*=2;
		} 
		if(flag){
			System.out.println("the number is power of 2");
		}else System.out.println("the number is not power of 2");
	}
	
}


//8.Write a program to find the first set bit of a number?

class BitNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number: ");
		int a=sc.nextInt();
		int b=a&-a;
		System.out.println("the first set bit of a the number "+a+" is "+b);
	}
}


//9.Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee
//(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?


class Employee{
	int employeeId;
	String employeeName;
	String department;
	double salary;
	public Employee(int employeeId,String employeeName,String department,double salary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.department=department;
		this.salary=salary;
		{
			System.out.println("Employee id: "+employeeId);
			System.out.println("Employee name: "+ employeeName);
			System.out.println("Department: "+ department);
			System.out.println("salary: "+salary);
		}
	}
	public static void main(String[] args){
		Employee emp=new Employee(1001,"David","Testing",50000.4567);
	}
}

//10. Write a program to check whether the object is an instance of a particular class?

class InstanceObject{
	public static void main(String[] args){
		InstanceObject obj1 = new InstanceObject();
		System.out.println(obj1 instanceof InstanceObject);
	}
}






