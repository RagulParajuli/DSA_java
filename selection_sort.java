public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22,
            11, 90};
            int size = arr.length;
            int min = -1;
            System.out.println("Before sorting");
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();

            for(int i=0; i < size-1; i++ ){
                min = i;
                for(int j = i+1; j < size; j++){
                    if(arr[j] < arr[min]){
                        min = j;
                    }
                }
                        int temp = arr[min];
                        arr[min] = arr[i];
                        arr[i] = temp;
            }
            System.out.println("After sorting");
            for (int i : arr) {
                System.out.print(i+" ");
            }
    }
}
