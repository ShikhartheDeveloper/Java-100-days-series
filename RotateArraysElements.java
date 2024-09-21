import java.util.Scanner;

public class RotateArraysElements {
    public static void main(String [] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};   //2,3,4,5,6,7,8,9,10,1
        System.out.println("Printing the elements:- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the no. for how many times you want to rotate the array left side :- ");
        int no=sc.nextInt();
        for(int i=0;i<no;i++){

        int temp=arr[0];
        for(int j=0;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        arr[arr.length-1]=temp; //1
    }
        System.out.println("\nRotated Elements:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
