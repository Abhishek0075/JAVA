public class area{
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
		int menu_selector=Integer.parseInt(args[0]),length,breadth;
		float radius;
		System.out.println("-----------Compute The Area-----------");
		System.out.print("* Press 1 for Rectangle \n* Press 2 for Square\n* Press 3 for Circle\n");
		System.out.print("* Press other key to Exit\n\n ");
		System.out.print(" >>> Selected ");
		if(menu_selector==1){ //Rectangle

			length=Integer.parseInt(args[1]);
			breadth=Integer.parseInt(args[2]);
			System.out.println("RECTANGLE");
			System.out.print("Inputs : \n");
			System.out.print(" >> Length : "+length+"\n");
			System.out.println(" >> Breadth : "+breadth);
			System.out.println("The area of the rectangle : "+Compute_area(length,breadth));
		}else if(menu_selector==2){ //Square
			length=Integer.parseInt(args[1]);
			System.out.println("SQUARE");
			System.out.print("Inputs : \n");
			System.out.print(" >> Length : "+length+"\n");
			System.out.println("The area of the square of length "+length+" : "+Compute_area(length));
		}else if(menu_selector==3){ //Circle
			radius=Float.parseFloat(args[1]);
			System.out.println("CIRCLE");
			System.out.print("Inputs : \n");
			System.out.print(" >> Radius : "+radius+"\n");
			System.out.println("The area of the circle : "+Compute_area(radius));
		}else{
			System.out.println("!! Wrong Option !!");
		}
	}
}

