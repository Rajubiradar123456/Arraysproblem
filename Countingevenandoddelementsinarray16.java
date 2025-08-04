public class Countingevenandoddelementsinarray16 {
    public static void main(String[] args) {
        int arr1[]={1, 20, 60, 31, 75, 40, 80};
        int counteven=0,oddeven=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                counteven++;
            }else{
                oddeven++;
            }
        }
        System.out.println("the even count is:"+counteven);
        System.out.println("the even count is:"+oddeven);

    }
}
