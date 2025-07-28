public class firsthalfinascandsecondhalfindesc7 {
    public static void bubblesort(int arr[]) {
      
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        
        for(int j=n-1;j>=n/2;j--){
            System.out.print(arr[j]+" ");
        }
    }


    public static void main(String[] args) {
          int arr[]={2,13,5,1,4,2,4,12,3};
          bubblesort(arr);
         
    }
}


// or
// import java.util.*;
// public class firsthalfinascandsecondhalfindesc7 {
//     public static void order(int arr[],int n){
//         Arrays.sort(arr);

//         for(int i=0;i<n/2;i++){
//             System.out.print(arr[i]+" ");
//         }
//         for(int j=n-1;j>=n/2;j--){
//             System.out.print(arr[j]+" ");
//         }
        
//     }
//     public static void main(String[] args) {
//         int arr[]={2,3,562,5,2,5,1,88,45};
//         int n=arr.length;
//         order(arr, n);
//     }
// }