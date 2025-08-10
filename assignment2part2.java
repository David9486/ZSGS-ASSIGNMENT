 //1.Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
import java.util.Arrays;
import java.util.Scanner;
class OddSum{
	public static void main(String[] args){
		int sum=0;
		int [] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 10 numbers:");
		for(int i=0;i<10;i++){     //for initializing the array
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<10;j++){  //for find the sum of odd numbers
			if(arr[j]%2!=0){
				sum+=arr[j];
			}
		}
		System.out.println("the sum of odd numbers are: "+sum);
	}
}

		
//2.Write a program to take in 10 values and print only those numbers which are prime.


class PrimeNumber{
		public static void main(String[] args){
			int [] arr=new int[10];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the 10 numbers:");
			for(int i=0;i<10;i++){     //for initializing the array
				arr[i]=sc.nextInt();
			}
		
			for(int j=0;j<10;j++){
				int count=0;
				int n=arr[j];
				if(n<=1){
					System.out.println("the number 0 and 1 are not prime numbers");
					continue;
				}
				for(int k=2;k<=n/2;k++){
					if(n%k==0){
						count++;
						break;
					}
				}
				
					if(count==0){
					System.out.println("the prime number is: "+n);
					}
				
				
			}
		}
}


//3.Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

class Fibonacci{
	public static void main(String[] args){
		int [] arr=new int[30];
			arr[0]=0;
			arr[1]=1;
			for(int i=2;i<30;i++){     //for initializing the array
				arr[i]=arr[i-1]+arr[i-2];
			}
			System.out.println("the first 30 fibonacci numbers are: "+Arrays.toString(arr));
			
	}
}
			
		
/*4.Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments.
 The function calculates sum of only single digit and sum of only double digit elements from the array. 
 Design a main() function to input size of the array ‘len' and 
single dimensional array of size 'len', and print the required result by invoking the function print( ).*/

class SingleDouble{
	public static void print(int[] a,int n){
		int sumSingle=0,sumDouble=0;
		for(int i=0;i<n;i++){
			if(a[i]>=0&&a[i]<=9){
				sumSingle+=a[i];
			}
			else if(a[i]>=10&&a[i]<=99){
				sumDouble+=a[i];
			}
		}
		System.out.println("the sum of single digits are: "+sumSingle);
		System.out.println("the sum of double digits are: "+sumDouble);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length of the array: ");
		int lengthOfArray=sc.nextInt();
		int[] arr=new int[lengthOfArray];
		System.out.println("enter the number for array: ");
		for(int j=0;j<lengthOfArray;j++){
			arr[j]=sc.nextInt();
		}
		print(arr,lengthOfArray);
	}
}


//5.Write a program to initialize the following character arrays and print a suitable message after checking the arrays 
//whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
//X[] =('m', 'n', 'o', 'p'} and
//Y[] =('m', 'n', 'o', 'p' }

class CheckArrays{
	public static void main(String[] args){
		int[] x={'m','n','o','p'};
		int[] y={'m','n','o','p'};
		boolean flag=true;
		if(Arrays.equals(x,y)){
			flag=true;
		}
		else{
			flag=false;
		}
		if(flag)System.out.print("the two array are equal");
	
		else System.out.print("the two array aren't equal ");
	}
}

//6.Write a program to accept the year of graduation from school as an integer value from the users .
 //Using the Binary search technique on the sorted array of integers given below .
// Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
//{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
		
class Graduation{
		public static void main(String... args){
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the year of graduation: ");
			int year=sc.nextInt();
			int[] arr={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
			Arrays.sort(arr);
			int left=0;
			int right=arr.length-1;
			boolean flag=false;
			while(left<=right){
				int mid=(left+right)/2;
				if(arr[mid]==year){
					flag=true;
					break;
				}
				else if(arr[mid]<year){
					left=mid +1;
				}
				else{
					right=mid-1;
				}
				
			}
			if(flag)System.out.print("record exists");
			else System.out.print("record doesn't exists");
		}
}
				
				
//7.Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.

class SelectionSort{
		static void selection(int [] arr){
			for(int i=0;i<arr.length;i++){
				int lastIndex=arr.length-i-1;
				int miniIndex=getMiniIndex(arr,0,lastIndex);
				swap(arr,miniIndex,lastIndex);
			}
		}
		static void swap(int [] arr,int first,int second){
			int temp=arr[first];
			arr[first]=arr[second];
			arr[second]=temp;
		}
		static int getMiniIndex(int [] arr,int start,int end){
			int min=start;
			for(int i=start;i<=end;i++){
				if(arr[min]>arr[i]){
					min=i;
				}
			}
			return min;
		}
		public static void main(String args[]){
			int[] arr=new int[10];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the 10 people's weight:");
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
			selection(arr);
			System.out.print("the array after sorted is: "+Arrays.toString(arr));
		}
}


//9. Write an array which takes in roll no and marks in 3 subjects for 10 students.
// Format and Print the roll no, total marks and average for all students in a table form.

class StudentTable{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		int[][] marks=new int[10][3];
		int[] rollNo=new int[10];
		int[] totalMarks=new int[10];
		double[] average=new double[10];
		for(int i=0;i<10;i++){
			System.out.println("enter the rollno: ");
			rollNo[i]=sc.nextInt();
			int sum=0;
			for(int j=0;j<3;j++){
				System.out.println("enter the marks for subject "+(j+1)+":");
				marks[i][j]=sc.nextInt();
				sum+=marks[i][j];
			}
			totalMarks[i]=sum;
			average[i]=totalMarks[i]/3;
			System.out.println();
		}
		
			  System.out.println("        "+"ROLLNO"+"   "+"TOTAL"+"     "+"    AVERAGE"+"        ");
		for(int i=0;i<10;i++){
			System.out.println("        "+rollNo[i]+"   "+totalMarks[i]+"   "+average[i]+"        ");
		}
	}
}

//Write a menu driven program to do following operation on two dimensional array A of size m x n.
// You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
//● To input elements into matrix of size m x n
//● To display elements of matrix of size m x n
//● Sum of all elements of matrix of size m x n
//● To display row-wise sum of matrix of size m x n
//● To display column-wise sum of matrix of size m x n
//● To create transpose of matrix of size n x m


class Matrix{
		static void input(int [][]arr,int row,int column){
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					System.out.print("enter the numbers for row "+(i+1)+" column "+(j+1)+":");
					arr[i][j]=sc.nextInt();
				}
			}
		}
		static void display(int[][]arr,int row ,int column){
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					System.out.print(arr[i][j]+" ");
				}
			System.out.println();
			}
		}
		static void sum(int[][]arr,int row ,int col){
			int sum=0;
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					sum+=arr[i][j];
				}
			}
			System.out.println("the sum of the numbers in the matrix are: "+sum);
		}
		static void rowSum(int[][]arr,int row,int col){
			for(int i=0;i<row;i++){
				int row_Sum=0;
				for(int j=0;j<col;j++){
					row_Sum+=arr[i][j];
				}
				System.out.println("the row wise sum of numbers are: "+row_Sum);
			}
		}
		static void columnSum(int[][]arr,int row,int col){
			for(int j=0;j<col;j++){
				int col_Sum=0;
				for(int i=0;i<row;i++){
					col_Sum+=arr[i][j];
				}
				System.out.println("the column wise sum of numbers are: "+col_Sum);
			}
		}
		static void transposeOf(int[][]arr,int row,int col){
			int[][]transposeMatrix=new int[row][col];
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					transposeMatrix[j][i]=arr[i][j];	
				}
			}
			System.out.println("   THE TRANSPOSE MATRIX   ");
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					System.out.print(transposeMatrix[i][j]+" ");
				}
			System.out.println();
			}
			
		}
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of row: ");
			int row=sc.nextInt();
			System.out.println("enter the number of col: ");
			int column=sc.nextInt();
			int[][]arr=new int[row][column];
			input(arr,row,column);
			display(arr,row,column);
			sum(arr,row,column);
			rowSum(arr,row,column);
			columnSum(arr,row,column);
			transposeOf(arr,row,column);
			
			
		}
}
		
			
			
		

		
	

		
		
				
			
			
		