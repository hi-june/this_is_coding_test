package DFSandBFS;

import java.util.ArrayDeque;
import java.util.Deque;

public class DFS_Stack {
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

    static boolean[] visited = new boolean[9];  // 인덱스를 고려하여 만듬

    static Deque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) {
        stack.push(1);
        visited[1] = true;

        while (!stack.isEmpty()) {
            int nodeIndex = stack.pop();
            System.out.print(nodeIndex + " ");

            for (int node : graph[nodeIndex]) {
                if (!visited[node]) {
                    stack.push(node);
                    visited[node] = true;
                }
            }
        }
    }
}
