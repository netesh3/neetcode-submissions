class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        Set<Integer> set = new HashSet();
        for(int [] t: triplets){
            if(t[0]>target[0] || t[1]>target[1] || t[2]>target[2]){
                continue;
            }
            for(int i=0;i<t.length;i++){
                if(t[i]==target[i]){
                    set.add(i);
                }
            }

        }
        return set.size()==target.length;
    }
}

/*
[
    [1,2,3],
    [7,1,1]
], 
target = [7,2,3]


[
    [2,5,6],
    [1,4,4],
    [5,7,5]], target = [5,7,6]


[
    [2,5,3],
    [2,3,4],
    [1,2,5],
    [5,2,3]]

    5,5,5
    
    triplets=[
            [7,1,3],
            [7,1,1]
        ]

        */