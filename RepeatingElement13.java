public class RepeatingElement13 {
    // public static void main(String[] args) {
    //     int arr[]={20,10,20,30,10,40,50,40,40};

    //     for(int i=0;i<arr.length;i++){
    //         boolean isrepeat=false;
    //         for(int j=0;j<i;j++){
    //             if(arr[i]==arr[j]){
    //                 isrepeat=true;
    //                 break;
    //             }
    //         }
    //         if(isrepeat)
    //             continue;

    //             boolean alreadyprinted=false;

    //             //  Ensure we don't print the same repeating number again
    //             for(int k=i+1;k<arr.length;k++){
    //                 if(arr[i]==arr[k]){
    //                     alreadyprinted=true;
    //                     break;
    //                 }
    //             }
    //             if(alreadyprinted){
    //                 System.out.print(arr[i]+" ");
    //             }

    //         }
        
    // }



    public static void main(String[] args) {
         int arr[]={20,10,20,30,10,40,50,40,40};

         for(int i=0;i<arr.length;i++){
            boolean isrepeat=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isrepeat=true;
                    break;
                }
            }
            if(isrepeat)
                continue;
                boolean alreadyprinted=false;
                for(int k=i+1;k<arr.length;k++){
                    if(arr[i]==arr[k]){
                        alreadyprinted=true;
                        break;
                }
            }
                if(alreadyprinted){
                System.out.print(arr[i]+" ");
            }

         }
    }
}









