public class Largestelement1{
    public static void main(String[] args) {
        int arr[]={1,24,63,12,54,23,88};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        // return max;
        System.out.println(max);
    }
}