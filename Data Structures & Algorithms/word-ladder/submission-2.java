class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> set = new HashSet();
        for(String s: wordList){
            set.add(s);
        }

        Queue<String> queue = new LinkedList();
        queue.add(beginWord);

        int res = 0;

        while(!queue.isEmpty()){
            int qsize = queue.size();
            res++;

            for(int i=0;i<qsize;i++){
                String poll = queue.poll();
                if(poll.equals(endWord)){
                    return res;
                }
                for(int j=0;j<poll.length();j++){
                    for(char c='a';c<='z';c++){
                        char[] ch = poll.toCharArray();
                        ch[j]=c;
                        String neb = new String(ch);
                        //String neb = poll.substring(0,j)+c+poll.substring(j+1);
                        if(set.contains(neb)){
                            queue.add(neb);
                            set.remove(neb);
                        }
                    }
                }
            }
        }
        return 0;   
    }
    
}
