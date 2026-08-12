class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(target > nums[mid]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return -1;
    }
}
