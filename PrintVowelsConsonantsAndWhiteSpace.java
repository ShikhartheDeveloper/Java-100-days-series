import java.util.Scanner;

public class PrintVowelsConsonantsAndWhiteSpace {

    public static void analyzeString(String s){
        int vowels =0 ;
        int consonants = 0 ;
        int whiteSpaces = 0 ;

        s = s.toLowerCase();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                consonants++;
            }
            else if(ch == ' '){
                whiteSpaces++;
            }

        }

        System.out.println("no of vowels :- "+vowels);
        System.out.println("No of consonants :- "+consonants);
        System.out.println("No of WhiteSpace :- "+whiteSpaces);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        analyzeString(str);

    }
}
