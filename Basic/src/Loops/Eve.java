package Loops;

public class Eve {
    public static void dis(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum =sum+ i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of first " + n + " even numbers: " + sum);
    }

    public static void main(String[] args) {
        dis(10);
    }
}
