public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {18, 9, 10, 44, 76,32};
        System.out.println(max(arr));
    }

     static int max(int[] arr) {
        int maxVal = arr[0];
         for (int i = 0; i<arr.length-1; i++) {
             if (arr[i]> maxVal){
                 maxVal = arr[i];
             }

         }
         return maxVal;

    }
}
