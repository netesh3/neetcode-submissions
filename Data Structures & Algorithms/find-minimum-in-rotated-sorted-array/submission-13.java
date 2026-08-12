class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.min(nums[0],nums[1]);
        }
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
        return nums[end];
    }
}



/*
//Need to find an element 
where next element is shorter and previous element in shorter
4,5,6,1,2,3

*/
