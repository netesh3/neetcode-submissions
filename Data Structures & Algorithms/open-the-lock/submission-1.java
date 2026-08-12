class Solution {
    public int openLock(String[] deadends, String target) {
        String start = "0000";
        
        if(target.equals(start)){
            return 0;
        }

        Set<String> set = new HashSet();
        for(int i=0;i<deadends.length;i++){
            set.add(deadends[i]);
        }

        if(set.contains(start)){
            return -1;
        }

        Queue<String> queue = new LinkedList();
        queue.add(start);
        set.add(start);

        int level = 0;

        while(!queue.isEmpty()){
            level++;
            int qsize = queue.size();
            for(int i=0;i<qsize;i++){
                String lock = queue.poll();
                for(int j=0;j<4;j++){
                    char curr[] = lock.toCharArray();

                    char ch = curr[j];

                    char dec = (ch == '0') ? '9' : (char)(ch - 1);
                    char inc = (ch == '9') ? '0' : (char)(ch + 1);

                    curr[j] = dec;
                    String s1 = new String(curr);
                    if (s1.equals(target)) return level;
                    if(!set.contains(s1)){
                        set.add(s1);
                        queue.add(s1);
                    }
                    curr[j] = inc;
                    String s2 = new String(curr);
                    if(s2.equals(target)) return level;
                    if(!set.contains(s2)){
                        set.add(s2);
                        queue.add(s2);
                    }
                    curr[j] = ch;
                }
            }
        }
        return -1;
    }
}