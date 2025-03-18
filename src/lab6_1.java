public class lab6_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {

            int invalidElement = array[10];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an index that is out of bounds.");
        }


        System.out.println("Program continues after handling the exception.");
    }
}
