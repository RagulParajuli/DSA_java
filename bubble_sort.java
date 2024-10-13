import java.util.Arrays;
public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22,
            11, 90};
            int n = arr.length;
            //  int [] sort =   Arrays.sort(arr); // built-in function to sort an array
            int steps = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                        steps++;
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        }
                        }
                        }
                        System.out.println("\nNumber of steps: " + steps);
                        System.out.println("Sorted array");
                        for (int i : arr) // enhanced for loop 
                        {
                            System.out.print(i+"\t");
                        }
    }
}