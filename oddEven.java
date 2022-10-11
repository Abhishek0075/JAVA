import java.util.Scanner;
class oddEven{
    public static void Odd_or_Even(int number){
        if(number % 2==0){
            System.out.println("The integer "+number+" is even");
        }else{
            System.out.println("The integer "+number+" is odd");
        }
    }
	public static void main(String[] args) {
		System.out.println("----------------ODD OR EVEN----------------");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the integer to be checked : ");
		int num1 = input.nextInt();
		Odd_or_Even(num1);
		input.close();
	}
}
