package 数组.删除排序数组中的重复项;

/**
 * @desc:
 * @author: 21927
 * @date: 2020/12/1 17:06
 */
public class Solution {
    /**
     * @desc: 给定 nums = [0,0,1,1,1,2,2,3,3,4]
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     * 你不需要考虑数组中超出新长度后面的元素。
     * @author: 21927
     * @date: 2020/12/1 17:14
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println("执行后:"+nums);
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4};
        removeDuplicates(nums);
    }
}
