public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 8, 9, 20, 250, 520, 852, 990, 1080, 1180, 2000,3000, 3500, 4000,
                4500, 6500, 7800, 9000, 10000, 12000};
        int target = 2000;
        System.out.println(ans(nums,target));


    }
    static int ans(int[] nums, int target){
        int start =0;
        int end = 1;

        while (target > nums[end]){
            int newStart = end+1;
            end = end + (end - start +1) * 2;
            start = newStart;
        }
        return BinarySearch(nums, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end){

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
