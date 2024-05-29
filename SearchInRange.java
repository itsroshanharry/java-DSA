public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {15, 66, 77, 44, 32, 98};
        int target = 66;

        System.out.println(search(arr, target, 0,2));
    }
    static int search(int[] arr, int target, int start, int end){

            if (arr.length == 0){
                return -1;
            }
            for (int i = start; i <=end; i++) {
                int element = arr[i];
                if (element == target) {
                    return i;
                }
            }
            return -1;
        }

    }

