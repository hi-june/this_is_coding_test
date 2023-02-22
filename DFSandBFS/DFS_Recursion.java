package DFSandBFS;

public class DFS_Recursion {
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

    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true; // 방문 처리
        System.out.print(nodeIndex + " ");
        for (int node : graph[nodeIndex]) {
            if (!visited[node]) {
                dfs(node);  // 함수의 재귀 호출이 스택과 다르지 않음
            }
        }
    }

    public static void main(String[] args) {
        dfs(1);
    }
}
