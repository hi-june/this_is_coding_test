package implementation.ch04;

import java.util.Scanner;

public class Ch0401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 5
        sc.nextLine();

        String plan = sc.nextLine();    // R R R U D D

        /**
         * R: y + 1
         * L: y - 1
         * D: x + 1
         * U: x - 1
         */

        String[] planArray = plan.split(" ");

        int x = 1;
        int y = 1;

        for (String step : planArray) {
            int temp_x = x;
            int temp_y = y;

            switch (step.charAt(0)) {
                case 'R':
                    temp_y += 1;
                    break;
                case 'L':
                    temp_y -= 1;
                    break;
                case 'D':
                    temp_x += 1;
                    break;
                case 'U':
                    temp_x -= 1;
                    break;
            }

            if (temp_x < 1 || temp_x > 5 || temp_y < 1 || temp_y > 5) { // 범위를 벗어나면
                continue;
            }
            x = temp_x;
            y = temp_y;
        }

        System.out.println(x + " " + y);
    }
}
