public class Merge2SortedArray {
    public static void main(String[] args) {
        int a[]={1,2,3};    //3
        int b[]={4,5,6};    //3
        int c[]=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length] = b[i];
        }

        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }

    }
}
