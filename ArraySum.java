import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int [n];

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            sum = sum + a[i];
        }
        System.out.println(sum/n + "");
    }
}
