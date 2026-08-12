class Solution {
    public int[] getConcatenation(int[] nums) {
        int res[] = new int[nums.length*2];
        int n = nums.length;
        int i=0;
        for(i=0;i<nums.length;i++){
            res[i]=nums[i];
            res[i+n]=nums[i];
        }
        return res;
    }
}