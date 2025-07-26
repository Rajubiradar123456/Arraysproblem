// public class SmallestandLargestelement {

//     public static int largest(int arr[]){
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         return max;
//     }
//     public static int smallest(int arr[]){
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         return min;
//     }
//      public static void main(String[] args) {
//         int arr[]={1,2,46,2,4,79,67,36,90,2};
//         System.out.println(largest(arr));
//         System.out.println(smallest(arr));
//     }
// }


// or

public class SmallestandLargestelement3 {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,9,43,1,67,8};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
