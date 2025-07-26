public class Secondsmallestelement4 {
    public static void main(String[] args) {
        int arr[]={4,6,2,7,3,22,5,1,23};
        int smallest=Integer.MAX_VALUE;
        int sec_smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        // for second smallest
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=smallest && arr[i]<sec_smallest){
                sec_smallest=arr[i];
            }
        }
        System.out.println(sec_smallest);
    }
}
