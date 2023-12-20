package Test;

public class BinarySearch {
    public static void main(String [] args){
       int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11};
        int n = arr.length;
        System.out.println("The maximum element is "+
                findMaximum(arr, 0, n-1));
       int maxValue = arr[0];
       int i=0;
       while(i<arr.length){
           if (maxValue<arr[i]){
               maxValue = arr[i];
           }
           i++;
       }
        System.out.println("maxValue is -> " + maxValue);
    }

    // BinarySearch logic
    private static int findMaximum(int[] arr, int low, int high) {

        if (low == high)
            return arr[low];
        if ((low + 1 == high) && arr[low] >= arr[high])
            return arr[low];
        if ((low + 1 == high) && arr[low] < arr[high])
            return arr[high];

        int mid = (low + high)/2;

        if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
            return arr[mid];
        if (arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1])
            return findMaximum(arr, low, mid-1);
        else
            return findMaximum(arr, low, mid+1);
    }
}
