/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class Main{
    public static void sum(int n1,int n2){
        int sum=n1+n2;
		System.out.println("Sum = "+sum);
    }
    public static void Odd_or_Even(int number){
        if(number % 2==0){
            System.out.println("The integer "+number+" is even");
        }else{
            System.out.println("The integer "+number+" is odd");
        }
    }
    public static void reverse(int number){
        int temp=number;
        int reverse=0,reminder;
        while(number>0){
            reminder=number%10;
            if(reminder==0){
                System.out.print("0");
            }
            reverse=reverse*10+reminder;
            number=number/10;
        }
        System.out.println(reverse);
    }
	public static void main(String[] args) {
	    //Add two numbers which user inputs
	    System.out.println("Enter two integers to be added");
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter first integer : ");
	    int num1 = input.nextInt();
	    System.out.print("Enter second integer : ");
	    int num2 = input.nextInt();
	    //Calling sum function
	    sum(num1,num2);
	    //Calling Odd_or_Even function
	    Odd_or_Even(num1);
	    Odd_or_Even(num2);
	    //Calling Reverse function
	    System.out.println("The reverse of "+num1+" is ");
	    reverse(num1);
	    System.out.println("The reverse of "+num2+" is ");
	    reverse(num2);
	}
}
