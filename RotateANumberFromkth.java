import java.util.Scanner;
public class RotateANumberFromkth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        //find no. of digits

        int nod=(int)Math.log10(n)+1;

        k = k % nod;
        if(k<0){
            k+=nod;
        }

        int div = (int)Math.pow(10,k);
        int mul = (int)Math.pow(10,nod - k);

        int leftpart = n / div;
        int rightpart = n % div;

        int rot = rightpart * mul + leftpart;

        System.out.println(rot);
    }
}