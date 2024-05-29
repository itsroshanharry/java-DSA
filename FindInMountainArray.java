public class FindInMountainArray {
    public static void main(String[] args) {
       int[] nums = {7,6,5,1,5,4,2};
       int target = 2;

        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target){
        int peak = peakIndexInMountainArray(nums);
        int firstTry = BinarySearch(nums, target, 0, peak);

        if (firstTry != -1){
            return firstTry;
        }
        return BinarySearch(nums, target, peak+1, nums.length-1);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start = mid +1;
            }
        }
        return start;
    }

    static int BinarySearch(int[] arr, int target, int start, int end){


        boolean ascen = arr[start] < arr[end];



        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }
            if (ascen) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
