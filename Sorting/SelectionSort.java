import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort ob= new SelectionSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       ob.sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"   ");
        }
    }
    
    public void sort(int arr[],int n){
        for (int i = 0; i <n-1; i++) {
             int val=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[val]){
                    val=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[val];
            arr[val]=temp;
        }

    }
}
