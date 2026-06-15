public class count_of_digits {
    public static void main(String[] args) {
        int num = 3174;
        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            count++;

            num = num/10;
        }
        System.out.println("Number of digits : " + count);
    }
}