package com.bptn.course.challenges._01_week_challenges;

class InsertPosition {

    // Create parameterized method to find the index where target should be inserted
    public static int searchInsert(int[] nums, int target) {

        // Get the length of the array
        int n = nums.length;

        // Iterate through the array
        for (int i = 0; i < n; i++) {

            // If current number is greater than or equal to target
            // Return the current index, as this is where the target should be inserted
            if (nums[i] >= target) {
                return i;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        // Test case 1: Input: nums = [1, 3, 5, 6], target = 5
        int nums1[] = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Example 1 Output: " + searchInsert(nums1, target1));  // Expected output: 2

        // Test case 2: Input: nums = [1, 3, 5, 6], target = 2
        int target2 = 2;
        System.out.println("Example 2 Output: " + searchInsert(nums1, target2));  // Expected output: 1

        // Test case 3: Input: nums = [1, 3, 5, 6], target = 7
        int target3 = 7;
        System.out.println("Example 3 Output: " + searchInsert(nums1, target3));  // Expected output: 4
    }
}
