class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        // One-pass approach is much safer with duplicates
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return true;

            // TRICKY PART: If start, mid, and end are all the same, 
            // we can't tell which side is sorted. Shrink the window.
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            } 
            // Left side is sorted
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            // Right side is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}