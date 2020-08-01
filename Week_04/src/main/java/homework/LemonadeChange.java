package homework;

/**
 * LeetCode-860: 柠檬水找零
 *
 * @author huldar
 * @date 2020-07-30 11:59
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
      int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return  false;
                }
            }
        }
        return true;
    }
}
