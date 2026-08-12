class Solution {
    public String reorganizeString(String s) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        PriorityQueue<int[]> max = new PriorityQueue<>((a,b)-> b[0]-a[0]);
        for(int i=0;i<26;i++){
            if(arr[i]>0)
                max.offer(new int[]{arr[i],i});
        }
        StringBuilder res = new StringBuilder();
        int prev[] = null;
        while(!max.isEmpty() || prev !=null){
            if(prev!=null && max.isEmpty()){
                return "";
            }

            int curr[] = max.poll();
            res.append((char)(curr[1]+'a'));
            curr[0]--;

            if(prev !=null){
                max.offer(prev);
                prev= null;
            }

            if(curr[0]>0){
                prev = curr;
            }

        }
        return res.toString();
    }
}