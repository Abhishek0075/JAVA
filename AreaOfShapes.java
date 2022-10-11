public class AreaOfShapes{
	public static void main(String[] args) {
		System.out.print("Choose any of the following to calculate area\n");
		System.out.print("1.Area of square\n");
		System.out.print("2.Area of rectangle\n");
		System.out.print("3.Area of circle\n");
		System.out.print("Entered choice:"+args[0]+"\n");
		int choice=Integer.parseInt(args[0]);
		switch(choice)
		{
	case 1:
		System.out.print("-->Entered side of the square:"+args[1]+"\n");
			int s=Integer.parseInt(args[1]);
			computeArea(s);
			break;
	case 2:
		System.out.print("-->Entered length of the rectangle:"+args[1]+"\n");
		int l=Integer.parseInt(args[1]);
		System.out.print("-->Entered breadth of the rectangle:"+args[2]+"\n");
		int b=Integer.parseInt(args[2]);
		computeArea(l,b);
		break;
	case 3:
			System.out.print("-->Entered radius of the circle"+args[1]+"\n");
			double r=Double.parseDouble(args[1]);
			computeArea(r);
			break;
	default:
		System.out.println("Wrong option!!\n");
		}
	}
	public static void computeArea(int side){
		int areasq;
		areasq=side*side;
		System.out.println("Area of square of given side:"+areasq);
	}
	public static void computeArea(int l,int b){
		int arearect;
		arearect=l*b;
		System.out.println("Area of rectangle of given length and breadth:"+arearect);
	}
	public static void computeArea(double r){
		double areac;
		areac=3.14*r*r;
		System.out.println("Area of circle of given radius:"+areac);
	}
}
