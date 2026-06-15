public class digits_in_number {
    public static void main(String[] args) {

        int num = 23456;

        while(num != 0) {
            int digit = num % 10;
            System.out.println(digit);

            num = num/10;
        }
    }
}