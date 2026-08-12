class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
        int gmax = 1;
        int max=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])==0){
                continue;
            }else if(Math.abs(nums[i]-nums[i+1])==1){
                max++;
            }else{
                if(gmax<max){
                    gmax = max;
                    max =1;
                }else{
                    max =1;
                }
            }
        }
        if(gmax<max){
            gmax = max;
        }
        return gmax;
    }
}
