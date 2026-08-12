class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                swap(nums,i,j);
                i++;j++;
            }else if(nums[j]==1){
                j++;
            }else if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }
        }
    }
    public void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}

//  public void sortColors(int[] nums) {
//         int i = 0;
//         int j = 0;
//         int k = nums.length-1;
//         while(j<=k)
//             if(nums[j]==0){
//                 swap(nums,i,j);
//                 i++;j++;
//             } else if (nums[j]==1) {
//                 j++;
//             } else if(nums[j]==2){
//                 swap(nums,j,k);
//                 k--;
//             }
//         }
//     }
//     public void swap(int[] nums, int index1, int index2){
//         int temp = nums[index1];
//         nums[index1] = nums[index2];
//         nums[index2] = temp;
//     }

/* 
i  j   k
[1,0,1,2]

if j and k == 0 (swap with i and shift i++)

if i and k == 1 (swap with j and shift j++)

if i and j == 2 (swap with k and shift k--)
*/