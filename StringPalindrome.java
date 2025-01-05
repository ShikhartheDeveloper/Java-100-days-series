import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abcba";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String news= gtr+"";
        if(str.equals(news)){
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not Palindrome number");
        }
    }
}
