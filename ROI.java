import java.util.Scanner;

interface Bank{
    float rateOfInterest();
    void CompoundInterest(int priAmount,int year);
}
class SBI implements Bank{
    public float rateOfInterest(){
        return 9.15f;
    }  
    public void CompoundInterest(int priAmount,int year){
        double FinalAmount=priAmount+Math.pow((1+9.15),year);
        System.out.println("Amount after compounding  : "+FinalAmount);
    }
}
class PNB implements Bank{ 
    public float rateOfInterest(){
        return 9.7f;
    }
    public void CompoundInterest(int priAmount,int year){
        double FinalAmount=priAmount+Math.pow((1+9.7),year);
        System.out.println("Amount after compounding  : "+FinalAmount);
    }
}
class ROI{ 
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Bank account;
        int year,priAmount,selector;
        System.out.print("Enter the amount to be deposited : ");
        priAmount=input.nextInt();
        System.out.print("Enter the number of years to be deposited : ");
        year=input.nextInt();
        System.out.println("1 for SBI\n2 for PNB\nOther keys to EXIT");
        System.out.print(" >> ");
        selector=input.nextInt();
        if(selector==1){
            System.out.println("===========SBI===========");
            account=new SBI();
            System.out.println("ROI: "+account.rateOfInterest());
            account.CompoundInterest(priAmount,year);
        }else if(selector==2){
            System.out.println("===========PNB===========");
            account=new PNB();
            System.out.println("ROI: "+account.rateOfInterest());
            account.CompoundInterest(priAmount,year);
        }
        input.close();
    }
}