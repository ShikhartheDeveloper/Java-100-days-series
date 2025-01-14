import java.util.Scanner;

public class HighestOccurringCharInString {

    public static char highestOccur(String str){
        int count[] = new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)] += 1;
        }
        int max = -1;
        char c = ' ';
        for(int i=0;i<str.length();i++){
            if(max<count[str.charAt(i)]){
                max = count[str.charAt(i)];
                c = str.charAt(i);
            }
        }
return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(highestOccur(input));


    }
}