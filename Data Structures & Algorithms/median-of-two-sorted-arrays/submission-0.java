class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int num: nums1){
            list.add(num);
        }
        for(int num: nums2){
            list.add(num);
        }
        Collections.sort(list);
        System.out.println(list.toString());
        int len = list.size();
        if(len%2 == 0){
            return (list.get(len/2-1)+list.get(len/2))/2.0;
        }else{
            return list.get(len/2);
        }
    }
}
