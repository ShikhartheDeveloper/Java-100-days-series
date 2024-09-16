public class FindMaxAndMinElementInArray {
    // hii friends here we find the maximum and minimum element present in array...
    public static void main(String[] args) {
        int arr[] = { 20, 39, 219, 6, 7, 2, 90 };
        int max = arr[0]; // suppose arr[0] is maximum means 20 is max then,
        int min = arr[0]; // suppose arr[0] is minimun means 20 is min then,

        // now for finding the maximum element
        for (int i = 1; i <= arr.length - 1; i++) {
            // checking the next elements arr[1],arr[2]
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element present in array :- " + max);

        // now for the minimum

        for (int i = 1; i <= arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("Minimum element present in array :- " + min);// 2

        // thank you soo much guyss............!

    }
}