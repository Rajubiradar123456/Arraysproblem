// public class Reverseanarray6 {
//     public static void main(String[] args) {
//         // int arr[]={2,2,4,45,1,3,5,54};
//         // for(int i=arr.length-1;i>=0;i--){
//         //     System.out.print(arr[i]+" ");

//         // }
//     }
// }


// or
public class Reverseanarray6 {

    public static void main(String[] args) {
        int arr[]={2,2,4,45,1,3,5,54};
        int start=0;int end=arr.length-1;
        while (start<end) {
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
    }
    // for printing array
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}