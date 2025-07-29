public class Frequencyofanumber9 {
    public static void main(String[] args) {
        int arr[]={2,4,6,3,4,6,32,34,32,43};
        int n=arr.length;
        int freq[]=new int[n];

        for(int i=0;i<n;i++){
            freq[i]=-1;
        }

        for(int i=0;i<n;i++){
            if(freq[i]!=0){
                int count=1;
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        freq[j]=0;
                    }
                }
                freq[i]=count;
            }
        }
        System.out.println("Frequency of each number:");
        for(int i=0;i<n;i++){
            if(freq[i]!=0){
                System.out.println(arr[i] + " -> " + freq[i]);
            }
        }
    }
}




// for understanding

// public class Frequency {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 4, 2, 3, 1}; // Example array
//         int n = arr.length;
//         int[] freq = new int[n];

//         // Initialize all frequencies to -1
//         for (int i = 0; i < n; i++) {
//             freq[i] = -1;
//         }

//         // Count frequencies
//         for (int i = 0; i < n; i++) {
//             if (freq[i] != 0) { // If not already counted
//                 int count = 1;
//                 for (int j = i + 1; j < n; j++) {
//                     if (arr[i] == arr[j]) {
//                         count++;
//                         freq[j] = 0; // Mark as counted
//                     }
//                 }
//                 freq[i] = count;
//             }
//         }

//         // Print frequencies
//         System.out.println("Frequency of each number:");
//         for (int i = 0; i < n; i++) {
//             if (freq[i] != 0) {
//                 System.out.println(arr[i] + " -> " + freq[i]);
//             }
//         }
//     }
// }

