import java.util.*;
public class ReverseANumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    while (n>0) {
        int dig = n%10;
        System.out.println(dig);
        n=n/10;
    }

  }
}
