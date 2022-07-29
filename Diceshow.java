import java.util.Scanner;
class Show{
    Show(){}
    public void show(){
        System.out.println("Show");
    }
}
public class Diceshow extends Show{
    private int sides;
    DiceShow(int sideCount){
        this.sides=sideCount;
    }
    public void show(int size){
        System.out.println("ONE");
    }
    public void show(){
        System.out.println("ONE");
    }
    public int getSidesCount(){
        return sides;
    }
    public static void main(String args[]){
        Show show=new DiceShow(8);
        show.show();
    }
}
