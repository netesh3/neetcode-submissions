class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // Map<Integer,Integer> map = new HashMap();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }
        List<List<Integer>> res = new ArrayList();
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;


            int j=i+1;
            int k =nums.length-1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    // Create a NEW list for every discovery
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    // Move pointers to find other potential pairs for the same 'i'
                    while (j < k && nums[j] == nums[j + 1]) j++; // Skip duplicate j
                    while (j < k && nums[k] == nums[k - 1]) k--; // Skip duplicate k
                    
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }
}
