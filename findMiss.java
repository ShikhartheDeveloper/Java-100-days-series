public class findMiss {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int sum1=0;
        for(int x=0;x<arr.length;x++){
            sum1=arr[x]+sum1;
            
        }
        System.out.print(sum1+" ");
    }
}
