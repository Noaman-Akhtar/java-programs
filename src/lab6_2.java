
    import java.util.Scanner;

    // User-defined exception
    class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public class lab6_2 {
        public static void main(String[] args) {
             lab6_2 example = new lab6_2 ();
            example.ProcessInput();
        }

        public void ProcessInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            try {
                // Check if the number is negative and throw an exception if it is
                if (number < 0) {
                    throw new NegativeNumberException("Error: Negative numbers are not allowed.");
                } else {
                    // Display the double value of the entered number
                    System.out.println("Double value of the entered number: " + (number * 2));
                }
            } catch (NegativeNumberException e) {
                // Handle the user-defined exception
                System.out.println(e.getMessage());
            }
        }
    }

