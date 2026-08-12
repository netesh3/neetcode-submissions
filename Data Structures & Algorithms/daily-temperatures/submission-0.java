class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[] = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            for(int j = i+1;j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    res[i]=j-i;
                    break;
                }else{
                    res[i]=0;
                }
            }
        }
        return res;
    }
}


/*
[30,38,30,36,35,40,28]

[1,4,1,2,1,0,0]

[22,21,20]

[0,0,0]
*/