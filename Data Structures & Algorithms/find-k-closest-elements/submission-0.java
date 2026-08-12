class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return arr[a[1]] - arr[b[1]];
        });

        for(int i=0;i<arr.length;i++){
            int diff = Math.abs(arr[i]-x);
            pq.add(new int[]{diff,i});
        }
        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < k; j++) {
            int[] poll = pq.poll();
            res.add(arr[poll[1]]); // Add the actual value, not the index
        }

        // The result must be sorted in ascending order
        Collections.sort(res);
        return res;
    }
}