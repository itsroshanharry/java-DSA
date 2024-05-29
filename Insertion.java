import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int arr[] = new int[15];
       System.out.println("Enter the size of array:");
       int n = in.nextInt();
        System.out.println("Enter the elments of array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
            System.out.println("Before insertion");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        System.out.println("Enter the element to be inserted");
            int x = in.nextInt();
        System.out.println("Enter the position to insert:");
        int pos = in.nextInt();

        Insert(arr, n, x, pos);
        arr[pos] = x;
        n = n+1;
        System.out.println("after insertion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
    }
    static void Insert(int[] a, int size, int key, int pos){

        for (int j = size; j >= pos; j--) {
            a[j+1] = a[j];
        }


    }
}
