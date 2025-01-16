import java.util.Scanner;

public class LAB11 {
    public static void main (String args []){
        String name="",section="",branch="";
        int roll_no ;

        Scanner obj = new Scanner (System.in);
        for(int i=1;i<=3;i++){
            System.out.println("enter"+i+" username ");
            name=obj.nextLine();

            System.out.println("enter roll no. ");
            roll_no= obj.nextInt();

            System.out.println("enter the section");
            section=obj.next();

            System.out.println("enter the branch");
            branch= obj.next();

            System.out.println("the username is "+name+" roll no. is "+ roll_no +" section "+section + " branch "+branch);
        }
    }
}
