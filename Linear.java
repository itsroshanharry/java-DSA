public class Linear {
    public static void main(String[] args) {
        int[] arr = {18, 44, 34, 88, 99, 33};
        int target = 44;
        System.out.println(search3(arr, target));
    }



    static int search2(int[] arr, int target ) {


        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return element;
            }
        }
        return -1;

    }

    static int search(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    static boolean search3(int[] arr, int target ) {

        if (arr == null){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
