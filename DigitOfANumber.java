import java.util.Scanner;

public class DigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int n = sc.nextInt();

        int nod = (int) Math.log10(n) + 1;

        int div = (int) Math.pow(10, nod - 1);

        System.out.println("The number of digits is : - ");

        while (div > 0) {
            int digit = n / div;
            System.out.println(digit);
            n = n % div;
            div = div / 10;

        }
    }
}