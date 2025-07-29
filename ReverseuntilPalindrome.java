public class ReverseuntilPalindrome {

    public class ReverseAddUntilPalindrome {

    // Method to check if a number is a palindrome
    static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    // Method to reverse a number
    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 87; // You can change this number
        // int steps = 0;

        while (!isPalindrome(num)) {
            int rev = reverse(num);
            int sum = num + rev;
            System.out.println(num + " + " + rev + " = " + sum);
            num = sum;
            // steps++;
        }

        // System.out.println("Palindrome found: " + num + " in " + steps + " steps");
    }
}
}


