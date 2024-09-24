import java.util.*;
public class UnionOperation {
    public static ArrayList<Integer> UnionOperation(int arr1[],int arr2[],int n, int m){
        TreeSet<Integer> set = new TreeSet<>();
        for(int x:arr1){
            set.add(x);
        }
        for(int x:arr2){
            set.add(x);
        }
        ArrayList <Integer> list = new ArrayList<>();
        for(int i:set){
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args){
        int arr1[]={1,2,2,3,5};
        int arr2[]={4,5,3,1,2};
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> li = UnionOperation(arr1, arr2, n, m);
        for(int x:li){
            System.out.print(x+" ");
        }

    }
}
