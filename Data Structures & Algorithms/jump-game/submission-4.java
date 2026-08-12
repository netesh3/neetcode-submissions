class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            max--;
            if(max<0){
                return false;
            }
            if(nums[i]>max){
                max = nums[i];
            }else if(max<=0 && nums[i]==0 && i<nums.length-1){
                System.out.println("max "+ max);
                return false;
            }
        }
        return true;
    }
}

/*
1,4,0,1,0,0

max = 7
[1,2,0,1,0]
[T,T,T,T,T]

[T,T,T,T,T]

max=1
[1,2,1,0,1]


*/