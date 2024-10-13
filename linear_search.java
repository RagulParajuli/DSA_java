class linear_search{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element is present at index " + result);
            } else {
                System.out.println("Element is not present in array");
                }
            }

                //  linearSearch
                public static int linearSearch(int[] arr, int target) {
                    int steps = 0;
                    for (int i = 0; i < arr.length; i++) {
                        steps++;
                        if (arr[i] == target) {
                            System.out.println("\nNo. of steps taken in Linear Search is : "+steps);
                            return i;
                        }
                        }
                        return -1;
                        }
}