class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        int last = nums.length-1;
        for(int i=0;i<=last;i++){
            while(last>=0 && val==nums[last] && i<=last){
                last--;
            }
            if(last>=i){
                if(val==nums[i]){
                    nums[i]=nums[last];
                    res++;
                    last--;
                }else{
                    res++;
                }
            }
            
        }
        return res;
    }
}