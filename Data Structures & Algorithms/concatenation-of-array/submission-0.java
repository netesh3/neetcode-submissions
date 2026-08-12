class Solution {
    public int[] getConcatenation(int[] nums) {
        int res[] = new int[nums.length*2];
        int i=0;
        for(i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        
        for(int j=0;j<nums.length;j++){
            res[i++]=nums[j];
        }
        return res;
    }
}