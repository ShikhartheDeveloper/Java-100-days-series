public class TwoDimensionalArray {
    public static void main(String[] args) {

        //approach 1st
        int a[][]= new int[3][2];
        a[0][0]=100;
        

        //approach 2nd
        int arr[][]={{100,200},{300,400},{500,600}};
        // System.out.println(arr[2][0]);

        // for(int ar[]:arr){
        //     for(int x:ar){
        //         System.out.print(x+" ");
        //     }
        //     System.out.println();
        // }


        for(int r=0;r<=arr.length-1;r++){
            for(int c=0;c<=arr[r].length-1;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("Length of Rows :- "+arr.length);
        System.out.println("Length of Columns :- "+arr[0].length);

    }
    
}
