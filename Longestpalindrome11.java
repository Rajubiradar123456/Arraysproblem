public class Longestpalindrome11 {

    public static boolean ispalindrome(int n){
        int original=n;
        int reversed=0;

        while(n>0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n/=10;
        }
        return original==reversed;

    }
    public static void main(String[] args) {
     int arr[]={121,131, 20, 99, 12321, 454, 88};
     int max=-1;
     for(int i=0;i<arr.length;i++){
        if(ispalindrome(i) && arr[i]>max){
            max=arr[i];
        }
     }
     if(max!=-1){
        System.out.println("maximm palindrome is:"+max);
    }else{  
        System.out.println("No palindrome found in array");
    }
    }
    
   
}

// or
//  public static boolean palindrome(int n){
//         int original=n;
//         int reversed=0;
//         while (n>0){
//             int digit=n%10;
//             reversed=reversed*10+digit;
//             n/=10;
//         } 
//         if(original!=reversed){
//             return false;
//         }
//         return true;

//     }
//     public static void main(String[] args) {
//         int arr[]={121,131, 20, 99, 12321, 454, 88};
//         int max=-1;
//         for(int i=0;i<arr.length;i++){
//             if(palindrome(i) && arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.println("Longest palindrome is: "+max );
//     }
