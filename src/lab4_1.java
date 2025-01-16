import java.util.Scanner;

class twoD{
    double l ;
    double b;
    final double cost=40;
    twoD (double l, double b){
        this.l=l;
        this.b=b;
    }
    double calculateArea(){
        return l*b;
    }
    double calculateCost()
    {
        return calculateArea()*cost;
    }
        }
        class threeD extends twoD{
    double h;
    final double cost3D = 60;
    threeD(double l,double b,double h){
        super(l,b);
        this.h=h;
    }
    double volume(){
        return l*b*h;

    }
    double calCost(){
        return volume()*cost3D;
            }
        }
public class lab4_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the shape 1. for 2D,2. for 3D");
        int shape=sc.nextInt();
        if(shape==1) {
            System.out.println("enter the length and breadth");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            twoD toD = new twoD(l, b);
            System.out.println("cost of the 2d sheet : rs " + toD.calculateCost());
        }
        else if(shape==2){
            System.out.println("Enter the length, breadth, and height: ");

            double length = sc.nextDouble();
            double breadth = sc.nextDouble();
            double height = sc.nextDouble();
            threeD teeD = new threeD(length, breadth, height);
            System.out.println("Cost of the 3D box: Rs " + teeD.calCost());

        }
        else
            System.out.println("invalid option");

    }
}
