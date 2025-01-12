import java.util.Scanner;

public class ReverseAString {
    public static String reverseAString(String str){
        String str2 = "";
        for(int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
        }
        return str2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : - ");
        String input = sc.nextLine();
        String result = reverseAString(input);
        System.out.println(result);
    }
}
