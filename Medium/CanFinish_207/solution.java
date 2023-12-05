package Medium.CanFinish_207;

import java.util.ArrayList;
import java.util.LinkedList;

public class solution {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1, 0}};
        boolean res = canFinish(numCourses, prerequisites);
        System.out.println(res);
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int total = 0;    //节点的总入度
        int[] deg = new int[numCourses];  //记录各节点的入度
        ArrayList<ArrayList<Integer>> path = new ArrayList<>();

        // 用空ArrayList初始化path
        for (int i = 0; i < numCourses; i++) {
            path.add(new ArrayList<>());
        }

        for (int[] temp : prerequisites) {
            deg[temp[0]]++;
            path.get(temp[1]).add(temp[0]);
            total++;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (deg[i] == 0) queue.add(i);
        }
        for(int i=0;i<queue.size();i++){
            System.out.println(queue.get(i));
        }
        while (!queue.isEmpty()) {
            for (int a : path.get(queue.pop())) {
                deg[a]--;
                total--;
                if (deg[a] == 0) {
                    queue.add(a);
                }
            }
        }
        return total == 0;
    }
}

