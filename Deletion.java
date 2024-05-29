import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] arr = new int[50];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Before deletion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Enter the position to be deleted");
        int pos = in.nextInt();
        for (int i = pos; i < n; i++) {
            arr[i] = arr[i+1];
        }
        --n;
        System.out.println("After deletion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}



