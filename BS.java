public class BS {
    public static void main(String[] args) {
        int[] arr = {18, 19, 240, 555, 860, 880, 999};
        int target = 999;
        System.out.println(BinarySearch(arr, target));

    }

    static int BinarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;



        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

         return -1;
        }
}