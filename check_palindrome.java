public class check_palindrome {
    public static int reverseNum(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {

        int originalNum = 121;
        int reversedNum = reverseNum(originalNum);

        if(originalNum == reversedNum) {
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }

    }
}