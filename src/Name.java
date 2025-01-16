import java.util.Scanner;

public class Name {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the first name ");
        String first = sc.next();
        System.out.println("enter the last name ");
        String last= sc.next();
        System.out.println(last+" "+first);
    }
}
