public class FindMissingNumber {
    public static void main(String[] args){
        int arr[]={1,2,4,5};    //3 
        for(int x:arr){
            System.out.print(x);
        }

        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1=arr[i]+sum1;
        }
        System.out.print("\nSum of the elements:- "+sum1+" ");  // sum2 = 15 sum1 = 12 if 15-12=3

        int sum2=0;

        for(int i=1;i<=5;i++){
            sum2=i+sum2;
        }
        System.out.println("Missing number :- "+(sum2-sum1));


    }
}
