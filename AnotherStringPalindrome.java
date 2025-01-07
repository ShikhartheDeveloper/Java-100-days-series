public class AnotherStringPalindrome {
    public static void main(String[] args) {
        String str = "TAKE YOU FORWARD";
        int i=0;
        int j=str.length()-1;
        boolean flag = true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag == true) System.out.println("Palindrome String");
        else System.out.println("Not Palindrome String");
            
        
    }
}
