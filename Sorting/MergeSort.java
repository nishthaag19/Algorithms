import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        MergeSort ob= new MergeSort();
        ob.sort(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    void sort(int arr[],int start,int end){
        if(start<end){
            int mid=(start+(end-start)/2);
            sort(arr,start,mid);
            sort(arr,mid+1,end);

            merge(arr,start,mid,end);
        }
    }
    void merge(int arr[],int p,int q,int r){
        int n1=q-p+1;
        int n2=r-q;

        int arr1[]= new int[n1];
        int arr2[]= new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i]=arr[p+i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i]=arr[q+1+i];
        }
        int i=0,j=0,k=p;
        while(i<n1&&j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr[k]=arr2[j];
                j++;
                k++;

            }
        }
      while(i<n1){
          arr[k]=arr1[i];
          i++;
          k++;

      }
      while(j<n2){
          arr[k]=arr2[j];
          j++;
          k++;
      }
    }
}
