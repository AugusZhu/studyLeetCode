package Day30;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZhuXianfei
 * @Date: 2020/8/4 17:25
 * @Revision: 1.0
 * @Description:
 */
public class demo01 {

    List<List<Integer>> edges;
    int[] visited;
    boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<Integer>());
        }
        visited = new int[numCourses];
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        for (int i = 0; i < numCourses && valid; ++i) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
        return valid;
    }

    public void dfs(int u) {
        visited[u] = 1;
        for (int v : edges.get(u)) {
            if (visited[v] == 0) {
                dfs(v);
                if (!valid) {
                    return;
                }
            } else if (visited[v] == 1) {
                valid = false;
                return;
            }
        }
        visited[u] = 2;
    }


    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int numCourses = 2;
        int prerequisites[][] = new int[][] {{1,0},{0,1}};

        System.out.println(d1.canFinish(numCourses,prerequisites));


    }

}
