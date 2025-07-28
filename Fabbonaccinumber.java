public class Fabbonaccinumber {
    public static void main(String[] args) {
        int n=5;
        int first=0;int second=1;
        System.out.print(first+" "+second+" ");

        for(int i=2;i<n;i++){
            int next=first+second;
            System.out.print(next + " ");
            first=second;
            second=next;
        }
    }
    // public static boolean isprime(int num){
    // if(num<=1){
    //     return false;
    // }
    //     for(int i=2;i<=Math.sqrt(num);i++){
    //         if(num%i==0){
    //             return false;
    //         }
    //     }
       
    //     return true;
    // }

    // printing prime numbers
    

    
    // public static void main(String[] args) {
    //     for(int i=1;i<=1000;i++){
    //         if(isprime(i)){
    //             System.out.println(i+" ");
    //         }
    //     }
    // }
}
