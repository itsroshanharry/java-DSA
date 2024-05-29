public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'f';
        System.out.println(BinarySearch(arr, target));

    }

    static char BinarySearch(char[] arr, char target) {
        int start = 0;
        int N = arr.length;
        int end = N - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }


        }
        return arr[start % N];
    }
}