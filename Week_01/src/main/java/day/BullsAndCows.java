package day;

import java.util.HashMap;
import java.util.Map;

/**
 * leetCode-299: 猜数字游戏
 *
 * @author bingjie.chen
 * @date 2020/7/11
 */
public class BullsAndCows {

    public String getHintUseTwoLoop(String secret, String guess) {
        int bull = 0;
        int cows = 0;

        //统计bull
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
            }
        }
        //TODO 这里可以进行优化 使用数组
        //找所有的有的 cows 其中包含bull
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapG = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            mapG.put(guess.charAt(i), mapG.getOrDefault(guess.charAt(i), 0) + 1);
            mapS.put(secret.charAt(i), mapS.getOrDefault(secret.charAt(i), 0) + 1);
        }
        for (Character key : mapG.keySet()) {
            int s = mapS.getOrDefault(key, 0);
            int g = mapG.getOrDefault(key, 0);
            cows += Math.min(s, g);
        }
        return bull + "A" + (cows - bull) + "B";
    }

    public String getHintUseTwoLoopOptimization(String secret, String guess) {
        int bull = 0, cows = 0;
        //下标代表0-9 值代表出现的次数
        int[] mapS = new int[10];
        int[] mapG = new int[10];

        //第一次遍历将bull++,将不一致的放到数组中
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
            }else {
                mapS[secret.charAt(i) - '0']++;
                mapG[guess.charAt(i) - '0']++;
            }
        }

        //获取cows
        for (int i = 0; i < 10; i++) {
            cows += Math.min(mapS[i], mapG[i]);
        }
        return bull + "A" + cows + "B";
    }

    public String getHintUseOneLoop(String secret, String guess) {
        //一层循环巧妙的运用了数量的正负,一个+ 一个-就使得出现正负
        int bull = 0, cows = 0;
        int[] nums = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (s == g) {
                bull++;
            }else {
                if (nums[s]++ < 0) {
                    cows++;
                }
                if (nums[g]-- > 0) {
                    cows++;
                }
            }
        }
        return bull + "A" + cows + "B";
    }
}
