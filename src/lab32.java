import java.util.Scanner;

class Shape{
    double area (double radius ){
        return Math.PI*radius*radius;
    }
    double area(double base , double height){
        return 0.5*base*height;
    }
    double area(int side){
        return side*side;
    }
}
public class lab32 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape ();
        System.out.println("enter the shape 1. for circle" +
                "2.traingle"+
                "3.square");
        int choice= sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("enter the radius of the circle ");
                double r=sc.nextDouble();
                System.out.println("the area of circle is "+ shape.area(r));
                break;
            case 2 :
                System.out.println("enter the base and height of the traingle ");
                double base = sc.nextDouble();
                double height= sc.nextDouble();
                System.out.println("the area of traingle "+shape.area(base,height));
                break;
            case 3 :
                System.out.println("enter the side of the square ");
                int side = sc.nextInt();
                System.out.println("the area of the square is "+shape.area(side));
                break;
            default:
                System.out.println("enter a valid choice ");
        }
    }
}
