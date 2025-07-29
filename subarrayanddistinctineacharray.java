
public class suarrayanddistinctineacharray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,1,4};
        int arr1=0;
        int arr2=0;
        int newarr1[]=new int[arr.length];
        int newarr2[]=new int[arr.length];


        for(int i=0;i<arr.length;i++){
            boolean isdistinct=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isdistinct=false;
                    break;
                }
            }
            if(isdistinct){
              newarr1[arr1++]=arr[i];
                // System.out.print(+" ");
            
            }
            else{
               newarr2[arr2++]=arr[i];
            }
        }

       
       System.out.println();
       for(int i=0;i<arr1;i++){
        System.out.print(newarr1[i]+" ");

       }
       System.out.println();
       for(int i=0;i<arr2;i++){
        System.out.print(newarr2[i]+" ");
       }

       
    }
}

