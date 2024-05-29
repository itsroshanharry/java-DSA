import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum =0; int product =1;
        int number = in.nextInt();

        while (number>0){
            int rem = number %10;
            number = number/10;
            sum = sum + rem;
            product = product * rem;

        }
        if (sum == product){
            System.out.println("the number is spy");

        }
        else {
            System.out.println("the number is not spy");
        }
    }
}
