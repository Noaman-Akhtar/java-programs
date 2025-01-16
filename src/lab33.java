import java.awt.*;
import java.util.Scanner;

class rectangle {
    double l;
    double b;
    void readDimensions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the rectangle  ");
         l =sc.nextDouble();
        System.out.println("enter breadth of the rectangle ");
         b = sc.nextDouble();
    }
    double Area(){
        return l * b;
    }
    double perimeter(){
        return 2*(l+b);
    }
    void display(){
        System.out.println("area "+Area());
        System.out.println("perimeter"+perimeter());
    }
}
public class lab33 {
    public static void main (String [] args){
        rectangle r = new rectangle();
    r.readDimensions();
    r.display();
    }
}
