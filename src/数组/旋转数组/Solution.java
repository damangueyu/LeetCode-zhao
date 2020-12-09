package 数组.旋转数组;

import java.lang.annotation.ElementType;
import java.util.Arrays;

/**
 * @desc:
 * @author: 21927
 * @date: 2020/12/3 15:37
 */
public class Solution {
    public static int[] rotate(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }
        if (k > nums.length) {
            k -= nums.length;
        }
        nums = overturn(nums, 0, nums.length - 1);
        nums = overturn(nums, 0, k - 1);
        nums = overturn(nums, k, nums.length - 1);
        return nums;
    }

    public static int[] overturn(int[] nums, int start, int end) {
        int j = 0;
        double lengh = end - start;
        for (int i = start; i < end; i++) {
            if (j >= lengh / 2) {
                break;
            }
            int t = nums[i];
            nums[i] = nums[end-j];
            nums[end-j] = t;
            j ++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2 };
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }
}
