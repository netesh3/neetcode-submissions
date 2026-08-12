class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int start = 1;

        int end = piles.length == 0 ? 0 : java.util.Arrays.stream(piles).max().getAsInt();
        
        int res = end;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            int temp = sum(piles,mid);
            System.out.println(mid + " T ");
            if(temp<=h){
                res = Math.min(res,mid);
            }
            if(temp>h){
                start = mid+1;
            }else{
                end = mid-1;
            }   
        }

        return res;
    }

    public int sum(int[] nums,int mid){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%mid == 0){
                sum += nums[i]/mid;
            }else{
                sum += nums[i]/mid+1;
            }
        }
        System.out.println("Sum: "+sum);
        return sum;
    }
}

/*
    num/mid = (num/mid)+1 
    if(num%mid !=0){
        add in sum 
    }

    [1,4,3,2]
    
*/

