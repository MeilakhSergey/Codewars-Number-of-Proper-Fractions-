
public class ProperFractions {
    public static void main(String[] args) {
        System.out.println(properFractions(Long.MAX_VALUE));
    }
    public static long properFractions(long n) {
        if (n == 1) {
            return 0;
        }

        long count = n;

        if (n % 2 == 0) {
            count -= count / 2;
            do {
                n /= 2;
            } while (n % 2 == 0);
        }

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                count -= count / i;
                do {
                    n /= i;
                } while (n % i == 0);
            }
        }

        return (n > 1) ? (count - count / n) : (count);
    }
}
