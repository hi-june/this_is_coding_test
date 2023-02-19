package greedy.ch03;

public class Ch0301 {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;  // 동전 개수
        int[] coinTypes = {500, 100, 50, 10};

        for (int coin : coinTypes) {
            count = count + (n / coin);
            n = n % coin;   // 거스름돈
        }

        System.out.println(count);
    }
}
