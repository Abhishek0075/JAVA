public class ThirdLarge {
    public static int Sorting(int[] arr){
        int temp;
        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
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
        int arr[]=new int[]{50,14,32,12,11,10,65,90,9};
        System.out.println("The 3rd largest number in the array : "+Sorting(arr));
    }
}
