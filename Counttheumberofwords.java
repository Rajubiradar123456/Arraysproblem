public class Counttheumberofwords {
    public static void main(String[] args) {
        // String s="i am raju   and my age is 29";
        // int count=1;

        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' '){
        //         count++;
        //     }
                
        // }
        // System.out.println(count);

        String s="i am raju   and my age is 29";
        String[] words=s.trim().split("\\s+");
        int wordscount=s.trim().isEmpty() ? 0 : words.length;
        System.out.println(wordscount);

    }
}
