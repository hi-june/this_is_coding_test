package greedy.ch03;

import java.util.Scanner;

public class Ch0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        while (true) {
            if (n % k != 0) {
                n -= 1;
            } else {
                n /= k;
            }
            count += 1;
            if (n == 1) break;
        }

        System.out.println(count);
    }
}
