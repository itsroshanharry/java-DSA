public class FloorOFNumber {
    public static void main(String[] args) {
        int[] arr = {-18, - 9, 9, 22, 56, 88, 99, 100, 150, 182};
        int target = 78;
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

            if (target>arr[arr.length-1]){
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

        return end;
    }
}


