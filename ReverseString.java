import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "there is";
        char[] message = str.toCharArray();
        reverse(message);
        System.out.println((message));
    }

    static void reverse(char[] arr) {


        int start = 0;
        int end = arr.length-1;


        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(char[] arr, int index1, int index2){

        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}

