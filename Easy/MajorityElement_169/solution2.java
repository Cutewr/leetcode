package Easy.MajorityElement_169;
/*
 * 给定一个大小为 n 的数组 nums ，
 * 返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */

public class solution2 {
    public static void main(String[] args) {
        int []nums={1};
        int res=majorityElement(nums);
        System.out.println(res);
    }
    //对数组进行排序，数组中间的位置一定是众数
    public static int majorityElement(int[] nums) {
        QuickSort(nums, 0, nums.length-1);
        int res=nums[nums.length/2];
        return res;
    }

    public static void QuickSort(int[] nums, int i, int j) {
        if (i < j) {
            int pivot = Partition(nums, i, j);
            QuickSort(nums, i, pivot - 1);
            QuickSort(nums, pivot + 1, j);
        }
    }

    public static int Partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low+1;
        int j = high;

        while (i <= j) {
            while (i <= j && nums[j] >= pivot) {
                j--;
            }

            while (i <= j && nums[i] <= pivot) {
                i++;
            }
            if (i <= j) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Swap pivot with nums[j]
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }
}
