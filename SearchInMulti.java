import java.util.Arrays;

public class SearchInMulti {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 9},
                {77, 55, 87},
                {35, 55, 77}
        };
        int target = 9;
//        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(search(arr,target)));

        System.out.println(max(arr));

    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{-1, -1};
    }


    static int max(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
