public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {999, 860, 555, 456, 300, 250, 200, 100, 9};
        int target = 999;
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

