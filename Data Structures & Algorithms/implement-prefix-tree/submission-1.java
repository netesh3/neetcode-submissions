class TrieNode{
    Map<Character,TrieNode> child = new HashMap();
    boolean endOfWord = false;
}


class PrefixTree {
    TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
       TrieNode curr = root;
       for(char c: word.toCharArray()){
            if(!curr.child.containsKey(c)){
                curr.child.put(c,new TrieNode());
            }
            curr = curr.child.get(c); 
       }
       curr.endOfWord = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray()){
            if(!curr.child.containsKey(c)){
                return false;
            }
            curr = curr.child.get(c);
        }
        return curr.endOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(char c: prefix.toCharArray()){
            if(!curr.child.containsKey(c)){
                return false;
            }
            curr = curr.child.get(c);
        }
        return true;
    }
}
