package implementation.ch04;

import java.util.Scanner;

public class Ch0403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String point = sc.next();
        int[][] move = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};

        int count = 0;
        for (int[] step : move) {
            int x = Integer.parseInt(point.substring(1));
            int y = point.charAt(0);

            x += step[0];
            y += step[1];
            if (y > 'a' + 7 || y < 'a' || x > 8 || x < 1) {
                continue;
            }
            count += 1;
        }

        System.out.println(count);
    }
}
