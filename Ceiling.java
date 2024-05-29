public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {9, 22, 56, 88, 99, 100, 150, 182};
        int target = 122;
        System.out.println(BinarySearch(arr, target));

    }

    static int BinarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        boolean ascen = arr[start] < arr[end];



        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (target > arr[arr.length-1]){
                return -1;
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

        return start;
    }
}


