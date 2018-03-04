import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(sc.nextLine()));
        sc.close();
    }

    public static boolean isPalindrome(String word) {
        if (word.length() < 2) {
            return true;
        }

        return word.charAt(0) == word.charAt(word.length() - 1) ?
            isPalindrome(word.substring(1, word.length() - 1)) : 
            false;
    }
}
