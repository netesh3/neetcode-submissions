class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mid-1>=0 && mid+1<nums.length && nums[mid-1]>nums[mid] && nums[mid+1]>nums[mid]){
                return nums[mid];
            }
            if(nums[mid]>nums[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return nums[start];
    }
}
