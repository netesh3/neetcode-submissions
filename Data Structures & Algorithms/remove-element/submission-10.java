class Solution {
    // public int removeElement(int[] nums, int val) {
    //     int k = 0;
    //     for(int i = 0;i<nums.length;i++){
    //         if(nums[i]!=val){
    //             nums[k]= nums[i];
    //             k++;
    //         }
    //     }
    //     return k;
    // }
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