class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left[i]=nums[i];
            }else{
                left[i]=nums[i]*left[i-1];
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1){
                right[j]=nums[j];
            }else{
                right[j]=nums[j]*right[j+1];
            }
        }
        int res[] = new int[nums.length];
        res[0]=right[1];
        res[nums.length-1]=left[nums.length-2];
        int k=1;
        while(k<=nums.length-2){
            res[k]=left[k-1]*right[k+1];
            k++;
        }
        return res;
    }
}  
