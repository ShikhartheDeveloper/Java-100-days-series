import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        // firstly sorted array
        int arr[]={7,7,2,4,1,8,3,9};
        // 1st approach hashset 

        //Sort the array
        Arrays.sort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }

        // HashSet<Integer> hashset = new HashSet<>();

        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]!=arr[i+1]){
        //         hashset.add(arr[i]);
        //     }
        // }
        // hashset.add(arr[arr.length-1]);
        // System.out.println("\n Non Duplicate Elements :- ");
        // System.out.println(hashset+" ");

        // ArraysList
        ArrayList<Integer> as = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                as.add(arr[i]);
            }
        }
        as.add(arr[arr.length-1]);
        System.out.println("\n Non Duplicate Elements :- ");
        System.out.println(as+" ");


    }
}
