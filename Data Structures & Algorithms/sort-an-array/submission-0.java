class Solution {
    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int[] temp = new int[nums.length];
        solve(nums,start,end,temp);
        return nums;
    }

    public void solve(int[] nums,int start, int end, int[] temp){
        if(start>=end){
            return;
        }
        int mid = start+(end-start)/2;
        solve(nums,start,mid,temp);
        solve(nums,mid+1,end,temp);
        merge(nums,start,mid,end,temp);
    }

    public void merge(int nums[], int start, int mid, int end, int temp[]){
        int i = start;
        int j = mid+1;
        int k = start;

        while(i <= mid && j <= end){
            if(nums[i]>=nums[j]){
                temp[k++]=nums[j++];
            }else{
                temp[k++]=nums[i++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=end){
            temp[k++]=nums[j++];
        }
        for (int index = start; index <= end; index++) {
            nums[index] = temp[index];
        }
    }
}