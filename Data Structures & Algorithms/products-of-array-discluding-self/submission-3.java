class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums.length == 0){
            return new int[]{};
        }
        int left[] = new int[nums.length];
        left[0]=1;
        //[1,2,4,8] 1,
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        int postfix = 1;
        for(int j=nums.length-1;j>=0;j--){
            left[j] = postfix*left[j];
            postfix = nums[j]*postfix;
        }
        return left;

    }
}  
