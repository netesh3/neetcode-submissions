class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){

            if(i>max){
                return false;
            }

            max = Math.max(max,i+nums[i]);
            
            if(max>=nums.length-1) return true;
        }
        return false;
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