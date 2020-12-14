package 数组.只出现一次的数字;

import java.util.Arrays;

/**
 * @desc:
 * @author: 21927
 * @date: 2020/12/14 17:38
 */
public class Solution {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
