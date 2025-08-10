//1.Write a program that uses if statement to find the minimum of three numbers.
import java.util.Scanner;
/*class Minimum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int min=0;
		System.out.println("enter the number 1: ");
		int a=sc.nextInt();
		System.out.println("enter the number 2: ");
		int b=sc.nextInt();
		System.out.println("enter the number 3: ");
		int c=sc.nextInt();
		min=a;
		if(min>b){
		min=b;
		}
		else if(min>c){
			min=c;
		}
		System.out.println("the minimum number among the three number are: "+min);
	}
}*/

/*2.Write a program to do the following patterns using for loop?
a) 1 1 R R R R
1 1 R R
1 R R R R
1 1 R R
1 1 R R   */
//a.
class Xpattern{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number: ");
			int n=sc.nextInt();
			int p=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j||j==n+1-i){
					System.out.print(p);
				}else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
//b.
class Rpattern{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number: ");
			int n=sc.nextInt();
			int mid=(n+1)/2;
			int mid2=(mid+1)/2;
			char c='R';
			for(int i=1;i<=n;i++){
            for(int j=1;j<=n-1;j++){
                if(i==1||i==mid){
                    System.out.print(c);
                } else if (i==mid2||i==n) {
                    if (j == 1 || j == n - 1) {
                        System.out.print(c);
                    } else System.out.print(" ");
                }
                else if(i==n-1){
                    if(j==1||j==n-2){
                        System.out.print(c);
                    }
                    else System.out.print(" ");
                }
                
            }
            System.out.println();
        }




    }
}
/* 3. Write a program to do the following patterns using while loop?
a) 1 b) w
2 3 w w
4 5 6 w w w
7 8 w w
9 w    */


//a.

/*class Pattern1{
	public static void main(String[] args){
		int i=1;
		int n=3;
		int p=1;
		while(i<=(2*n)-1){
			int col=i>n?2*n-i:i;
			int sp=n-col;
			int s=1;
			while(s<=sp){
				System.out.print(" ");
				s++;
			}
			int j=1;
			while(j<=col){
				System.out.print(p+" ");
				j++;
				p++;
			}
			i++;
			System.out.println();
		}
	}
}*/

//b. 
class Pattern2{
	public static void main(String[] args){
		char s='w';
		int n=5;
		for(int i=1;i<=n;i++){
			int col;
			if (i <= 3) {
                col = i;
            } else {
                col = 6 - i; 
            }
			for(int j=1;j<=col;j++){
				System.out.print(s+" ");
			}
			col++;
			System.out.println();
		}
	
	}
}

/*4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS  */

//a.


/*class Pattern3{
	public static void main(String[] args){
		int i=1;
		int n=5;
		do{
			int sp=n-i;
			int s=1;
			do{
				if(s>sp) break;
				System.out.print(" ");
				s++;
			}while(true);
			int p=1;
			int j=1;
			do{
				if(j>i) break;
				System.out.print(p+" ");
				p=p*(i-j)/j;
				j++;
			}while(true);
			System.out.println();
			i++;
		}while(i<=n);
			
	}
}*/
//b
class Pattern4{
	public static void main(String[] args){
		char[] arr={'Z','O','H','O','C','O','R','P','O','R','A','T','I','O','N','S'};
        int i=1;
        int n=4;
        int p=0;
        do{
            int j=1;
            do{
                System.out.print(arr[p]);
                j++;
                p++;
            }while(j<=n);
            i++;
            System.out.println();
        }while(i<=n);
    }
}
//5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.


/*class EvenNumber{
	public int evenNum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				continue;
			}
			sum+=i;
		}
		return sum;
		
	}
}
class Main{
	public static void main(String[] args){
	EvenNumber eve=new EvenNumber();
	System.out.println("the sume of even digits are: "+eve.evenNum(10));
	
	}
}*/

//6.Define a method to convert the decimal number to a binary number?	

/*class DecimalToBinary{
		public int decimalBin(int n){
			int res=0;
			int k=n;
			while(k>0){
				int r=k%2;
				res=res*10+r;
				k=k/2;
			}
			return res;
		}
		public static void main(String[] args){
				DecimalToBinary db=new DecimalToBinary();
				System.out.println("the decimal to binary conversion: "+db.decimalBin(13));
		}
}*/
			
			
	
/*7.Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”*/

/*class GradeSystem{
	public void withIf(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the percentage scored:");
		int n=sc.nextInt();
		if(n<=100){
			if(n>=85 && n<=100){
				System.out.println("the grade for the student is: "+"A");
			}
			else if(n>=70){
				System.out.println("the grade for the student is: "+"B");
			}
			else if(n>=50){
				System.out.println("the grade for the student is: "+"C");
			}
			else{
				System.out.println("the student failed");
			}
		}
	}
	public void switchStatement(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the percentage scored:");
		int n=sc.nextInt();
		int k=n/10;     // as case can only handle value. we can't check with range limit
		switch(k){
			case 10:
				if(n<=100){
					System.out.println("the grade for the student is: "+"A");
				}
				break;
			case 9:
				if(n<=100){
					System.out.println("the grade for the student is: "+"A");
				}
				break;
			case 8:
				if(n<=100){
					System.out.println("the grade for the student is: "+"A");
				}
				break;
			case 7:
				if(n>=70){
						System.out.println("the grade for the student is: "+"B");
						break;
				}
			case 6:
				if(n>=50){
						System.out.println("the grade for the student is: "+"C");
						break;
				}
			case 5:
				if(n>=50){
					System.out.println("the grade for the student is: "+"C");
					break;
				}
			default:
				System.out.println("the student failed the exam");
		}
	}


	
	
	public static void main(String[] args){
		GradeSystem gs= new GradeSystem();
		//gs.withIf();
		gs.switchStatement();
	}
}*/




		
		