import java.util.Scanner;
class alternate_prime{
    public static int check_prime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void prime(int range){
        range=range*2;
        int count=0;
        int num=2;
        while(count<range){
            if(check_prime(num)==1){
                if(count%2==0){
                    System.out.print(num+" ");
                }
                count+=1;
            }
            num+=1;
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of prime numbers needed : ");
        int range=input.nextInt();
        System.out.print("The list of alternate prime numbers : ");
        prime(range);
        input.close();
    }
}