import java.util.*;

public class ToggleTheGivenStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :- ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int ascii = (int) ch;
            if (ascii >= 97)
                flag = false;
            if (flag == true) { // means Capital
                ascii += 32; // to convert into small
                char dh = (char) ascii;
                str.setCharAt(i, dh);
            } else {
                ascii -= 32;
                char dh = (char) ascii;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }

}