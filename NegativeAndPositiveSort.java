import java.util.*;
public class NegativeAndPositiveSort {
    public static void SortNegativeAndPositive(int arr[]){
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("Enter the Elements :- ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        SortNegativeAndPositive(arr);
        for(int x:arr){
            System.out.print(x+" ");    // -9,-7,-1,1,2,2,3,4,8
        }

    }
}
