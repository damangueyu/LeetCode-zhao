package 数组.存在重复元素;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * @desc:
 * @author: 21927
 * @date: 2020/12/10 17:18
 */
public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        System.out.println(containsDuplicate(nums));
    }
}
