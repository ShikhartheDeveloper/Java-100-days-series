import java.util.*;
public class SumArrayElements {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int arr[] = new int[5];
    System.out.println("Enter elements ");
    for(int i=0;i<=arr.length-1;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("here is what you entered :- ");
    for(int i=0;i<=arr.length-1;i++){
        System.out.print(arr[i]+" ");
        // now the sum
        sum=arr[i]+sum;
    }
    System.out.print("\nSum of Elements are :- "+sum);
   }
}

// thankyou soo much guysss..........
