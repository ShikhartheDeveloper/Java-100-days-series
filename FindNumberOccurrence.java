import java.util.Scanner;

public class FindNumberOccurrence {
    public static int printOccurrence(int arr[],int find){
        int count=0;    // 
        for(int x:arr){
            if(find==x){
                count++; //1,2,3,4,  output=4
            }
        }
        return count;
    }
    public static void main(String [] args){
        int arr[]={1,2,2,2,2,3,7,8,8,9};
        //length
        System.out.println("Length of Array :- ");
        System.out.println(arr.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you found how many time the elemenet occur in the Array:- ");
        int find = sc.nextInt();
        int printingOccurrence = printOccurrence(arr, find);
        System.out.println(printingOccurrence); //4

        

    }
}
