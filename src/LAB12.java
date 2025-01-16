import java.util.Scanner;

public class LAB12 {
public static void main (String args []){
    Scanner obj  = new Scanner(System.in);
    System.out.println("enter your chemistry marks ");
    int marks= obj.nextInt();
    if(marks>=90)
        System.out.println("A");
    if(marks>=80&&marks<90)
        System.out.println("B");
    if(marks>=70&&marks<80)
        System.out.println("C");
    if(marks>=60&&marks<70)
        System.out.println("D");
    if(marks>=50&&marks<60)
        System.out.println("E");
    if(marks>=40&&marks<50)
        System.out.println("F");
    if(marks<40)
        System.out.println("failed");


}
}
