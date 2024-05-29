public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {18,34,675, 7648, 23456, 677, 2, 4567890, 2345};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[] nums){
        if (nums.length == 0){
            return -1;
        }
        int count = 0;
        for (int num: nums){
            if(even(num)){
              count++;
            }
        }
        return count;
    }

    static boolean even(int num){


       return Digits(num) % 2 == 0;
    }

    static int Digits(int num){
        int count = 0;

        while (num>0){
            count ++;
            num /= 10;
        }
        return count;
    }
}
