class RandomizedSet {

    Set<Integer> set;
    int size = 0;
    public RandomizedSet() {
        set = new HashSet();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        set.add(val);
        size++;
        return true;
    }
    
    public boolean remove(int val) {
        if(!set.contains(val)){
            return false;
        }
        set.remove(val);
        size--;
        return true;
    }
    
    public int getRandom() {
        int rand = new Random().nextInt(size);
        Iterator<Integer> it = set.iterator();
        while(rand>0){
            rand--;
            it.next();
        }
        return it.next();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */