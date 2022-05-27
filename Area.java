import java.util.Scanner;
public class Area{
    public static float Compute_area(int length,int breadth){
        float rect_area=length*breadth;
        return rect_area;
    }
    public static double Compute_area(int length){
        double square_area=length*length;
        return square_area;
    }
    public static double Compute_area(float radius){
        double circle_area;
        circle_area=(((float)22)/7)*(radius*radius);
        return circle_area;
    }
	public static void main(String[] args){
	    int menu_selector,length,breadth;
	    float radius;
	    Scanner input=new Scanner(System.in);
	    System.out.println("-----------Compute The Area-----------");
	    System.out.print("* Press 1 for Rectangle \n* Press 2 for Square\n* Press 3 for Circle\n");
	    System.out.print("* Press other key to Exit\n >>> ");
	    menu_selector=input.nextInt();
	    if(menu_selector==1){
    	    System.out.print("Input the length and breadth of the rectangle : \n>>> ");
    	    length=input.nextInt();
    	    System.out.print(">>> ");
    	    breadth=input.nextInt();
    	    System.out.println("The area of the rectangle : "+Compute_area(length,breadth));
	    }else if(menu_selector==2){
    	    System.out.print("Input the length of the square : \n>>> ");
    	    length=input.nextInt();
    	    System.out.println("The area of the square : "+Compute_area(length));
	    }else if(menu_selector==3){
    	    System.out.print("Input the radius of the circle(in decimals) : \n>>> ");
    	    radius=input.nextFloat();
    	    System.out.println("The area of the circle : "+Compute_area(radius));
	    }else{
	        System.out.println("----------Thank you for using----------- ");
	    }
	}
}
