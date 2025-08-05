// public class MaximumProductofsubarray18 {

//         static int maxSubarrayProduct(int arr[])
//     {
//         // Initializing result
//         int result = arr[0];
//         int n = arr.length;
 
//         for (int i = 0; i < n; i++)
//         {
//             int mul = arr[i];
//             // traversing in current subarray
//             for (int j = i + 1; j < n; j++)
//             {
//                 // updating result every time
//                 // to keep an eye over the
//                 // maximum product
//                 result = Math.max(result, mul);
//                 mul *= arr[j];
//             }
//             // updating the result for (n-1)th index.
//             result = Math.max(result, mul);
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int number[]={ 10, -20, -30, 0, 70, -80, -20 };
//         System.out.println("Maximum Sub array product is " + maxSubarrayProduct(number));

//     }
// }



// or
public class MaximumProductofsubarray18 {
public static void subarray(int  number[]){
    int currentproduct=0;
        int maxval=number[0];
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
               currentproduct=1;
                for(int k=i;k<=j;k++){
                   currentproduct*=number[k];
                }
                // System.out.println(currentproduct);
                if(maxval<currentproduct){
                    maxval=currentproduct;
                }
            }
            
        }
        System.out.println("the maximum sum is:"+maxval);
    }
    public static void main(String[] args) {
        int number[]={10, -20, -30, 0, 70, -80, -20};


        subarray(number);
    }
}