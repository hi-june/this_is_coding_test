package greedy.ch03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ch0302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n,m,k와 숫자 배열을 라인 단위로 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        String nums = sc.nextLine();
        int[] numsArray = Stream.of(nums.split(" ")).mapToInt(Integer::parseInt).toArray();

        /* */
        Arrays.sort(numsArray); // 배열 정렬
        int first = numsArray[n-1]; // 가장 큰 수
        int second = numsArray[n-2];    // 두 번째로 큰 수

        int groupCount = m / (k + 1);   // 묶음의 개수
        int remain = m % (k + 1);   // 최대 값을 더할 나머지 개수

        int answer = first * (groupCount * k + remain) + second * (groupCount * 1);
        System.out.println(answer);
    }
}
