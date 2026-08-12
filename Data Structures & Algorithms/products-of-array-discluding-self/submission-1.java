class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums.length == 0){
            return new int[]{};
        }

        int left[] = new int[nums.length];
        left[0] = 1;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        //1,1,2,8
        int var = 1;
        int res[] = new int[nums.length];
        for(int j = nums.length-1;j>=0;j--){
            res[j] = var*left[j];
            var = var*nums[j];
        }
        return res;

    }
}  
