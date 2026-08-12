class Solution {
    public int majorityElement(int[] nums) {
       int count = 1;
       int num = nums[0];
       for(int i=1;i<nums.length;i++){
            if(nums[i]!=num){
                if(count>0){
                    count--;
                    if(count == 0){
                        num = nums[i];
                    }
                }else{
                    count = 1;
                    num = nums[i];
                }
                
            }else{
                count++;
            }
       }
       return num;
    }
}

/*
[1,2,3,2,2,2,5,4,2]
count = 0;
num = 2;
*/