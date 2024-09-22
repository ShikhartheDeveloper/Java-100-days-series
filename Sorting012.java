public class Sorting012 {
    public static void SortingTheElements012(int arr[],int size){
        int zero=0;
        int one =0;
        int two =0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }
        int index=0;
        for(int i=0;i<zero;i++){
            arr[index++]=0;
        }
        for(int i=0;i<one;i++){
            arr[index++]=1;
        }
        for(int i=0;i<two;i++){
            arr[index++]=2;
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,1,0,0,2,1,0,2};
        int size=arr.length;
        SortingTheElements012(arr, size);
        System.out.println("Sorted Elements :- ");  //0 0 0 1 1 1 2 2 2
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
