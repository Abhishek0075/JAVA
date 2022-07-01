import java.util.Scanner;
public class student{
    int roll_No;
    String name;
    float mark1,mark2,mark3,total;
    public student(String in_name,int in_roll,float inmark1,float inmark2,float inmark3){
        
        name=in_name;
        roll_No=in_roll;
        mark1=inmark1;
        mark2=inmark2;
        mark3=inmark3;
        total=inmark1+inmark2+inmark3;
    }
    public void display_details(){
        System.out.println("===========Student=========");
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+roll_No);
        System.out.println("===========MARKS===========");
        System.out.println("English : "+mark1);
        System.out.println("Malayalam : "+mark2);
        System.out.println("Science : "+mark3);
        System.out.println("===========================");
        if(mark1<50 || mark2<50 || mark3<50){
            total=0;
        }
        System.out.println("Total marks : "+total);
    }
    public static void main(String[] args){
        String a;
        int b,times;
        float m1,m2,m3;
        student[] s1;
        Scanner input=new Scanner(System.in);
        
        
        System.out.print("Enter the number of students : ");
        times=input.nextInt();
        s1=new student[times];
        for(int i=0;i<times;i++){
            System.out.print("Enter the name :");
            a=input.nextLine();
            System.out.print("Enter the Roll number :");
            b=input.nextInt();
            System.out.print("Enter the marks of English :");
            m1=input.nextFloat();
            System.out.print("Enter the marks of Malayalam :");
            m2=input.nextFloat();
            System.out.print("Enter the marks of Science : ");
            m3=input.nextFloat();
            s1[i]=new student(a,b,m1,m2,m3);
        }
        for(int i=0;i<times;i++){
            s1[i].display_details();
        }
    }
}