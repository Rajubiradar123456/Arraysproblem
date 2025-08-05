// disjoint means intersection of 2 arrays is empty

public class Disjointornot19 {
    static boolean disjoint(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    return false;
                }
            }

        }
        return true;
    }


    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6};
        int arr2[]={7,8,9,1};
        if(disjoint(arr1, arr2)){
            System.out.println("this is disjoint");
        }
        else{
            System.out.println("not an disjoint");
        }
    }
}
