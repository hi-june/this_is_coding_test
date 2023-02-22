package DFSandBFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static int[][] graph = {    // 인접 리스트 방식
            {}, // 0
            {2, 3, 8},  // 1
            {1, 7}, // 2
            {1, 4, 5},  // 3
            {3, 5}, // 4
            {3, 4}, // 5
            {7},    // 6
            {2, 6, 8},  // 7
            {1, 7}  // 8
    };

    static boolean[] visited = new boolean[9];

    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        queue.offer(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int nodeIndex = queue.poll();
            System.out.print(nodeIndex + " ");
            for (int node : graph[nodeIndex]) {
                if (!visited[node]) {
                    queue.offer(node);
                    visited[node] = true;
                }
            }
        }
    }
}
