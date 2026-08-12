class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int res[] = new int[len*2];
        for(int i=0;i<nums.length;i++){
            res[i] = nums[i];
            res[len+i] = nums[i];
        }
        return res;
    }
}

// [1,4,1,2]
// ans[i] == nums[i]
// ans[i + n] == nums[i]

// [1,4,1,2,1,4,1,2]