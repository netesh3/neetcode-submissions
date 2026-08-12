class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = findFirst(nums,target);
        res[1] = findLast(nums,target);
        return res;
    }

    public int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                res = mid;
                end = mid-1;
                continue;
            }
            if(target >= nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return res;
    }

    public int findLast(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(nums[mid]==target){
                res = mid;
                System.out.println("T "+res);
                start = mid+1;
                continue;
            }
            if(target >= nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return res;
    }
}

/*

5,8,8,8,8,8,10

*/