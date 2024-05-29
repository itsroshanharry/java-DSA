public class maxRange {
    public static void main(String[] args) {
        int[] arr = {18, 9, 10, 44, 76,32};
        System.out.println(max(arr, 0,3));
    }

    static int max(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i<=end; i++) {
            if (arr[i]> maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;

    }
}



