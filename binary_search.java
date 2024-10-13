
public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,
            6, 7, 8, 9, 10};
            int target = 7;
            int result = binarySearch(arr, target);
            if (result == -1) {
                System.out.println("Element is not present in array");
                } else {
                    System.out.println("Element is present at index " + result);
                    }
               }

                    // binarySearch
                    public static int binarySearch(int[] arr, int target) {
                        int steps = 0; 
                        int left = 0;
                        int right = arr.length - 1;
                        while (left <= right) {
                            steps++;
                            int mid = (right + left) / 2;
                            if (arr[mid] == target) {
                                System.out.println("\nSteps taken to find the element: " + steps);
                                return mid;
                                } else if (arr[mid] < target) {
                                    left = mid + 1;
                                    } else {
                                        right = mid - 1;
                                        }
                                        }
                                        return -1;
                                        }
}