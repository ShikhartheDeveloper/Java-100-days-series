import java.util.*;
public class FindGivenElement {
    // hii friends here we learn about the arrays and find the given element 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("element what you find :- ");
        int find = sc.nextInt();
        boolean found = false;     // initially false because if we found the value then we can true the found
        int arr[] = new int[5]; // here We declare the Array

        // now take the elements from the user
        //using for loop
        System.out.println("Enter the elements :- ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // now for finding the given element 

        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                found=true; //   change from false to true because we found what we entered
            }
        }

        // check if found 
        if(found){
            System.out.println("Element found " + find);
        } else {
            System.out.println("Element not found "+ find);
        }
        // we found the element 25 thats why element found condition true....
        // thanks guysss for watchingggg.........
    }
}
