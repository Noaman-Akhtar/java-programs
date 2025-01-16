import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        boolean validInput = true;

        System.out.println("Enter three numbers:");

        String input1 = reader.readLine();
        String input2 = reader.readLine();
        String input3 = reader.readLine();

        if (!isInteger(input1) || !isInteger(input2) || !isInteger(input3)) {
            System.out.println("Enter valid integer inputs.");
            validInput = false;
        }

        if (validInput) {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            int num3 = Integer.parseInt(input3);

            int largest = num1;

            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }

            System.out.println("The largest number among the input integers is: " + largest);
        }
    }

    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
