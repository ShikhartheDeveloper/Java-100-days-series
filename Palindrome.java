import java.util.Scanner;

public class Palindrome{
    public static void main(String [] args){
        int r,temp,p=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for checking the palindrome or not :- ");
        int n=sc.nextInt();
        temp=n;
        while(temp>0){
            r=temp%10;
            p=r+(p*10);
            temp=temp/10;

        }
        if(n==p){
            System.out.println(n +" is palindrome number ");

        } else {
            System.out.println(n+ " is not a palindrome number ");
        }
    
    
    
    }
}
