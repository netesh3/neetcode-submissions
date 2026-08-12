class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
         int start = 1;
        int end = piles[piles.length-1];
        int res = end;
        while(start<end){
            int mid = start+(end-start)/2;
            int hourCount = 0;
            for(int i=0;i<piles.length;i++){
                int consume = piles[i]/mid;
                if(piles[i]%mid != 0){
                    hourCount = hourCount+consume+1;
                }else{
                    hourCount = hourCount+consume;
                }
            }
            if(hourCount<=h && mid<=res){
                res = mid;
            }
            if(hourCount>h){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return res;
    }
}

//25,10,23,4 
//7,3,6,1