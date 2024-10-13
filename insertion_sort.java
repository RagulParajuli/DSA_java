public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int i, j, key;
        int size = arr.length;
        for (i = 1; i < size; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                }
                arr[j + 1] = key;
                }

        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}
