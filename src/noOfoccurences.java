public class noOfoccurences {
    public static void main(String[] args) {
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

        System.out.println("Element occurrences:");
        boolean[] counted = new boolean[n]; // Array to keep track of counted elements

        for (int i = 0; i < n; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true; // Mark this element as counted
                    }
                }
                System.out.println(arr[i] + ": " + count);
            }
        }
    }
}
