class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return nums[end];
    }
}



/*
//Need to find an element 
where next element is shorter and previous element in shorter
4,5,6,1,2,3
(0,5)-> 2 
6 > 3 -> if yes then ans is min would be right side
start = mid+1;
else end = mid;
(3,5)-> 4

2>3
end = mid;

(3,4) -> 3
end = 3
*/
