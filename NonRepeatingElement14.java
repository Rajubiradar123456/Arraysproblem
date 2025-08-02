public class NonRepeatingElement14 {
    public static void main(String[] args) {
        int arr[]={10, 30, 40, 20, 10, 20, 50, 10};
        for(int i=0;i<arr.length;i++){
            boolean isrepeat=false;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    isrepeat=true;
                    break;
                }
            }
            if(!isrepeat){
                System.out.print(arr[i]+" ");
            }
        }
    }

    // or
    

    // public static void main(String[] args) {
    //     int arr[] = {10, 30, 40, 20, 10, 20, 50, 10};

    //     for (int i = 0; i < arr.length; i++) {
    //         int count = 0;

    //         // Count how many times arr[i] occurs in the entire array
    //         for (int j = 0; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                 count++;
    //             }
    //         }

    //         // If it occurs only once, print it
    //         if (count == 1) {
    //             System.out.print(arr[i] + " ");
    //         }
    //     }
    // }
}
