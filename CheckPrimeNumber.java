import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for how many numbers you want to check :- ");
        int t = sc.nextInt();
        System.out.println("Enter the number for checking the prime or not :- ");
        for (int i = 0; i < t; i++) {
            // here we taking the input for checking the primeness and non primeness of a
            // number
            int n = sc.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime Number \n");
            } else {
                System.out.println("Not Prime Number \n");
            }
        }
    }
}
