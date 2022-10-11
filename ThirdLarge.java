import java.util.Scanner;
public class ThirdLarge {
    public static int Sorting(int[] arr,int element){
        int temp;
        for(int i=0;i<element-1;i++){
            for(int j=i+1;j<element;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[2];
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int element;
        System.out.print("Enter the number of elements in the array : ");
        element=input.nextInt();
        int arr[]=new int[element];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<element;i++){
            System.out.print(" >> ");
            arr[i]=input.nextInt();
        }
        System.out.println("The 3rd largest number in the array : "+Sorting(arr,element));
        input.close();
    }
}
