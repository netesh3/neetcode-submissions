class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return solve(nums,start,end,target);
    }
    public int solve(int[] nums, int start, int end, int target){
        if(start>end){
            return start;
        }
        int mid = start+(end-start)/2;

        if(target == nums[mid]){
            return mid;
        }
        if(nums[mid]>target){
            return solve(nums,start,mid-1,target);
        }
        return solve(nums,mid+1,end,target);
    }
}