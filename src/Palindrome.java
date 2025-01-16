import java.util.Scanner;

public class Palindrome {
    public static void main (String args []){
        Scanner sc= new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number ");
        int num= sc.nextInt();
        int temp=num;
        while(temp>0){
            int r=temp%10;
             sum = (sum*10)+r;
            temp=temp/10;
        }
        if(num==sum)
        System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
