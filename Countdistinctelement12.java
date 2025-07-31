// public class Countdistinctelement12 {
//     public static void main(String[] args) {
//         int arr[]={10, 30, 40, 20, 10, 20, 50, 10};
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             boolean isdistinct=true;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     isdistinct=false;
//                     break;
//                 }
//             }
//             if(isdistinct){
//                 System.out.print(arr[i]+" ");
//                 count++;
//             }
//         }
//         System.out.println();
//         System.out.println("the number of count is:"+count);
//     }
// }


public class Countdistinctelement12 {

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        boolean isrepeat=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isrepeat=true;
                }
            }
        }
        if(isrepeat){
            System.out.println("it is a duplicate");
        }
        else{
            System.out.println("not duplicate");
        }
    }
}