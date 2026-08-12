class Solution {
    public int search(int[] nums, int target) {
       int start = 0;
       int end = nums.length-1;
       int res = Arrays.binarySearch(nums,target);
       return res>=0?res:-1;
       //return solve(nums,start,end,target);
    }
    public int solve(int[] nums, int start, int end, int target){
            if(start>end){
                return -1;
            }
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                return solve(nums,start,mid-1,target);
            }
            return solve(nums,mid+1,end,target);
    }
}
