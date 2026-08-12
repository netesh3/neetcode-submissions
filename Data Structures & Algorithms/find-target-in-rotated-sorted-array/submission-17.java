class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(nums[mid]==target){
                System.out.println("11 "+mid);
                return mid;
            }

            System.out.println("T "+nums[mid]);
            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }
            else{
                if(target>nums[mid] && target<=nums[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}


/*

nums=[4,5,6,7,0,1,2]
target=0
========
start = 0
end = 6
mid = 3;
========
start = 4
end = 6
mid = 5;
==========
start = 4
end = 4
mid = 4


nums=[1,3]
target=3

start = 0
end = 1
mid = 1

*/

