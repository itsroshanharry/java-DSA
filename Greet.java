import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
//        greet();
//        String message = mygreet();
//        System.out.println("hello " +message);

        String message = greeting( "" );
        System.out.println("hello " +message);
    }

//    static void greet(){
//        System.out.println("Hello world");
//    }

//return string type
// static String mygreet(){
//    System.out.println("Enter a name:");
//    Scanner in = new Scanner(System.in);
//    String name = in.next();
//    return name;
//
//}

static String greeting(String name){
        Scanner in = new Scanner(System.in);
        name = in.next();
        return name;
}
}
