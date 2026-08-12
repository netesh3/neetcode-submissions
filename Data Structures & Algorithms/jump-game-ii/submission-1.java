class Solution {
    public int jump(int[] nums) {

    if(nums.length ==1){
        return 0;
    }
    int res = 0;
    int max = 0;
    int lastJump=0;
    for(int i=0;i<nums.length;i++){
        max = Math.max(max,i+nums[i]);
        System.out.println(" MAX: "+ max);
        if(i==lastJump){
            System.out.println("Jump "+ i + " : "+ lastJump + " : "+max);
            lastJump = max;
            res++; 
            if (lastJump >= nums.length - 1) break;
        }
        // if(max>=nums.length-1){
        //         return res;
        // }
        
    }
    return res;   
    }
}

/*
[2,4,1,1,1,1]
[2,]

[2]->
*/