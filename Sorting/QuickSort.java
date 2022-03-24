import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public void sort(int arr[], int start, int end) {
        if (start < end) {
            int pivot =partition(arr,start,end);
            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);

        }
    }
    public int partition(int arr[],int p,int q){
        int pivot=q;
        int i=p-1;
        for (int j = p; j <=q ; j++) {
            if(arr[j]<=arr[pivot]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return i;
    }
}
