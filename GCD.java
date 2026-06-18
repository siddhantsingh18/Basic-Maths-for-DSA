public class GCD {

    public static int gcd(int a, int b) {

        while(b != 0) {
            int oldValueOfB = b;
            b = a%b;
            a = oldValueOfB;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(18,12));

    }
}