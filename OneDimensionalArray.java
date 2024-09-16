public class OneDimensionalArray{
    public static void main(String[] args) {

        //approach 1st
        int arr[]= new int[5];
        arr[0]=100;
        //approach 2nd
        int a[]={100,200,300,400,500,600};
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println(a.length);
    }
}