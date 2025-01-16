import java.util.Arrays;

public class sort {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("Please provide the size of the array followed by the array elements as command line arguments.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        if (args.length != n + 1) {
            System.out.println("Please provide exactly " + n + " array elements.");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }

        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
