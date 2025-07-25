public class Smallestelement2 {
    public static void main(String[] args) {
        int arr[]={24,63,1,12,54,23,88};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
