public class checkSubset {
    public static boolean CheckSubsetNumber(int arr1[],int arr2[], int n , int m){
        for(int i=0;i<m;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(arr2[i]==arr1[j]){
                    found=true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
    public static void main(String args[]){
        int arr1[]={5,1,7,2,9,3};
        int arr2[]={5,2,3,9};
        int n=arr1.length;
        int m=arr2.length;
        if(CheckSubsetNumber(arr1, arr2, n, m)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
