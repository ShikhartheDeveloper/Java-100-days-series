import java.util.*;
public class FindSecondLargestElement {
    public static void print2LargestElement(int arr[]){
        if(arr.length<2){
            System.out.println("Invalid Elements");
            return;
        }
        Arrays.sort(arr);

        // ArrayList<Integer> as = new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     as.add(arr[i]);
        // }

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                System.out.println("Second Largest Element :- "+arr[i]);
                return;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={5,2,8,1,5,10,17,9};  //10

        print2LargestElement(arr);
    }
}
