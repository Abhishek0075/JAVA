import java.util.Scanner;
public class reverseNumber{
    public static String reverse(String num){
        char temp;
        String newString="";
        for(int i=0;i<num.length();i++){
            temp=num.charAt(i);
            newString=temp+newString;
        }
        return newString;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number to be reversed : ");
        Scanner input=new Scanner(System.in);
        String num=input.nextLine();
        String revert=reverse(num);
        System.out.println("The reverse of the number "+num+" : "+revert);
        input.close();
    }
}
