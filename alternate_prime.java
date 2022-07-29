class alternate_prime{
    public static int check_prime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void prime(int range){
        int count=0;
        int num=2;
        while(count<range){
            if(check_prime(num)==1){
                if(count%2==0){
                    System.out.print(num+" ");
                }
                num+=1;
                count+=1;
            }else{
                num+=1;
            }
        }
    }

    public static void main(String[] args){
        prime(6);
    }
}