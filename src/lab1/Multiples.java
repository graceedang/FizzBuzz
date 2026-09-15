package lab1;
public class Multiples {
    static void main() {
        int count = multiples(10, 3, 5);
        System.out.println(count);

        System.out.println(multiples());
    }

    private static int multiples(int n, int a, int b) {
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (i % a == 0 || i % b == 0) {
                count += 1;
            }
        }
        return count;
    }

    private static int multiples() {
        int count = 0;

        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count += 1;
            }
        }
        return count;
    }
}
