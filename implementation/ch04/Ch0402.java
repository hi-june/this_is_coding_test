package implementation.ch04;

import java.util.Scanner;

public class Ch0402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // n시 59분 59초

        /**
         * 초: 0 ~ 59
         * 분: 0 ~ 59
         * 시: 0 ~ n
         */

        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (String.valueOf(k).contains("3") || String.valueOf(j).contains("3") || String.valueOf(i).contains("3")) {
                        count += 1;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
