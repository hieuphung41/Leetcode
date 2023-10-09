package Problem_34;

public class BinarySolution {

//    34. Find First and Last Position of Element in Sorted Array
//    Given an array of integers 'nums' sorted in non-decreasing order,
//    find the starting and ending position of a given 'target' value.
//
//    If 'target' is not found in the array, return '[-1, -1]'.
//
//    You must write an algorithm with 'O(log n)' runtime complexity.

    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearchLeft(nums, target);
        int rightIdx = binarySearchRight(nums, target);

        return new int[] {leftIdx, rightIdx};
    }

    public int binarySearchLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left >= nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }

    public int binarySearchRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }

}
