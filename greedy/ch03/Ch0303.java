package greedy.ch03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ch0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        int row = sc.nextInt();
        sc.nextLine();

        int answer = 0;
        for (int i = 0; i < column; i++) {
            String cardInput = sc.nextLine();
            int[] card = Stream.of(cardInput.split(" ")).mapToInt(Integer::parseInt).toArray(); // 카드 줄 마다 배열로 만듬
            answer = Math.max(Arrays.stream(card).min().getAsInt(), answer);    // 배열에서 최솟값을 찾아 answer 갱신
        }

        System.out.println(answer);
    }
}
