public class RotationCount {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr));
    }

    static int search(int[] nums){
        int pivot = findPivot(nums);
        return pivot+1;

    }

    static int findPivot(int[] nums){
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if (nums[mid]<= nums[start]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return -1;
    }

    static int findPivotInDuplicates(int[] nums){
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if (nums[start] == nums[mid] && nums[end]== nums[mid]){
                if (nums[start]> nums[start+1]){
                    return start;
                }
                start++;

                if (nums[end]< nums[end-1]){
                    return end-1;
                }
                end--;
            }

            else if (nums[start]< nums[mid] || (nums[start]==nums[mid] && nums[mid] > nums[end])){
                start = mid-1;
            }
            else {
                end = mid + 1;
            }

        }
        return -1;
    }

}
