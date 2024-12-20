import java.util.Scanner;
public class PrintDigits {
    //in this program we print the how many numbers you entered as a input like if you enter 5,7,8,2,7,1 then print 6 in the output because you entered 6 digits
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int dig=0;
        while(n!=0){
            n=n/10;
            dig++;
        }
        System.out.println(dig);
    }
}
