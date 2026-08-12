class Solution {

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
            int i=0;
            int j=0;
            int m = nums1.length;
            int n = nums2.length;
            int total = m+n;
            int prev = 0;
            int curr = 0;
            for(int count = 0;count<=total/2;count++){
                prev = curr;
                if(i<m && (j>=n || nums1[i]<nums2[j])){
                    curr = nums1[i];
                    i++;
                }else{
                    curr = nums2[j];
                    j++;
                }
            }
            if(total%2 == 0){
                return (prev+curr)/2.0;
            }else{
                return curr;
            }

    }

    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int res[] = new int[nums1.length+nums2.length];
    //     int i=0;
    //     int j=0;
    //     int k=0;
    //     while(i<nums1.length && j<nums2.length){
    //         if(nums1[i]>nums2[j]){
    //             res[k++] = nums2[j++];
    //         }else{
    //             res[k++] = nums1[i++];
    //         }
    //     }
    //     while(i<nums1.length){
    //         res[k++] = nums1[i++];
    //     }
    //     while(j<nums2.length){
    //         res[k++] = nums2[j++];
    //     }
    //     int len = res.length;
    //     if(len%2==0){
    //         return (res[(len/2)-1]+res[len/2])/2.0;
    //     }else{
    //         return res[len/2];
    //     }

    // }

    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     List<Integer> list = new ArrayList<>();
    //     for(int num: nums1){
    //         list.add(num);
    //     }
    //     for(int num: nums2){
    //         list.add(num);
    //     }
    //     Collections.sort(list);

    //     int len = list.size();
    //     if(len%2 == 0){
    //         return (list.get(len/2-1)+list.get(len/2))/2.0;
    //     }else{
    //         return list.get(len/2);
    //     }
    // }
}
