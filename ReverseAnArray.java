import java.util.*;
public class ReverseAnArray {
    // reverse an array
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in array :- ");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        // for printing the entered elements

        System.out.print("Entered elements :- ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // reverse the array elements

        System.out.print("Reverse array elements :- \n");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }

    // thanks guyssss........

}
