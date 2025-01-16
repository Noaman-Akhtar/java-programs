import java.util.Scanner;

class Box{
    double length;
    double width;
    double heigth;
    Box(double length,double width,double heigth){
        this.length=length;
        this.width= width;
        this.heigth=heigth;
    }
    double volume1(){
        return length*width*heigth;
    }
}
public class lab31Demo {
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the l");
    double l=sc.nextDouble() ;
        System.out.println("enter the width");
        double w=sc.nextDouble() ;
        System.out.println("enter the heigth");
        double h=sc.nextDouble() ;
Box box1 = new Box(l,w,h);
double volume= box1.volume1();
        System.out.println("the volume1 of the box1 is "+volume);
    }}
