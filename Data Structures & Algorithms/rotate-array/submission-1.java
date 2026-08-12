class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k = k%nums.length;
        }
        int i=0;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;j--;
        }
        System.out.println(Arrays.toString(nums));
        int a = 0;
        int b = k-1;
        while(a<b){
            System.out.println(a +" : "+b);
            swap(nums,a,b);
            a++;b--;
        }
        int s = k;
        int n = nums.length-1;
        while(s<n){
            swap(nums,s,n);
            s++;n--;
        }
    }

    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*
[1,2,3,4,5,6,7,8]
[8,7,6,5,4,3,2,1]
while(i<k){
swap(i,k);
}

*/