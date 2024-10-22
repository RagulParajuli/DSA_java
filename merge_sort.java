import java.util.*;
public class merge_sort {

    private static void mergeSort(int[] arr, int l, int r){
        if(l < r){
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r){
        
        int n1 = m - l + 1;
        int n2 = r - m;
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int i=0; i<n1; i++){
            lArr[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            rArr[j] = arr[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
        }
        else{
            arr[k] = rArr[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k] = lArr[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k] = rArr[j];
        j++;
        k++;
    }
}

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sr.nextInt();
            }
            System.out.println("Before Merge Sort");
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }

            mergeSort(arr, 0, arr.length-1);

            System.out.println("\nAfter Merge Sort");
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[j]+" ");
            }
    }
}