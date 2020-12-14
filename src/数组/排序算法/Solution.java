package 数组.排序算法;

import javax.xml.stream.events.StartDocument;

/**
 * @desc:
 * @author: ZXB
 * @date: 2020/12/11 15:48
 */
public class Solution {
    public static int[] nums = new int[80000];
    static {
        for (int index = 0; index < 80000; index++) {
            nums[index] = (int)(Math.random() * 80000);
        }
    };

    /**
     * @desc: 插入排序
     * 从第2个开始循环，向前两两比较，符合条件则交换继续比较，否则停止本次比较
     * @author: ZXB
     * @date: 2020/12/11 15:52
     */
    public static int[] insertSort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0) {
                if (nums[j - 1] > nums[j]) {
                    int t = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = t;
                    j--;
                } else {
                    break;
                }
            }
        }
        return nums;
    }

    /**
     * @desc: 快速排序
     * 从两端比较 符合条件交换位置
     * @author: ZXB
     * @date: 2020/12/11 16:03
     */
    public static int[] quickSort(int[] nums,int left ,int right) {
        int i = left;
        int j = right;
        int standard = nums[i];
        while (i < j) {
            while (nums[j] > standard) {
                j--;
            }

            while (nums[i] < standard) {
                i++;
            }

            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        quickSort(nums,left,j-1);
        quickSort(nums,j+1,right);
        return nums;
    }
}
