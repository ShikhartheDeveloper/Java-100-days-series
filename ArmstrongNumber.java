import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int temp,a=0,r;
        Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        temp=n;
        while(temp>0){
            r=temp%10;
            a=a+(r*r*r);
            temp=temp/10;
        }
        if(a==n){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not a Armstrong number");
        }
    }
}
