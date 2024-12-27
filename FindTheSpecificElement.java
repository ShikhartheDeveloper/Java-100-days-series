import java.util.*;
public class FindTheSpecificElement {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    boolean found= false;

    System.out.println("enter the elements :- ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the checking element :- ");
    int find = sc.nextInt();

    for(int i=0;i<arr.length;i++){
        if(arr[i]==find){
            found=true;
        }
    }

    if(found){
        System.out.println("Element Exist..."+find);
    } else {
        System.out.println("Element not exist....!"+find);
    }
    
   }
}
