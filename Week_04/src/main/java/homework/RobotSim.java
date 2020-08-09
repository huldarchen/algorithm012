package homework;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode-847: 模拟机器人
 *
 * @author huldar
 * @date 2020-08-05 19:47
 */
public class RobotSim {
    /**
     * 模拟机器人行走,
     * @param commands 命令集 -2:向左转90度 -1:向右转90度 1-9向前行走步数
     * @param obstacles 障碍物集
     * @return 最大的欧式距离平方
     */
    public int robotSim(int[] commands, int[][] obstacles) {
        // 处理障碍物
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + " " + obstacle[1]);
        }
        // 定义行走的方向
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int d = 0, x = 0, y = 0, result = 0;
        for (int command : commands) {
            if (command == -1) {
                //切换方向
                d = (d + 1) % 4;
            } else if (command == -2) {
                d--;
                if (d == -1) {
                    d = 3;
                }
            } else {
                while (command-- > 0 && !obstacleSet.contains((x + dirs[d][0]) + " " + (y + dirs[d][1]))) {
                    x += dirs[d][0];
                    y += dirs[d][1];
                }
            }
            result = Math.max(result, x * x + y * y);
        }
        return result;
    }

}
