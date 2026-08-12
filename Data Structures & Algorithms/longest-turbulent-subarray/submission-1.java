class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int len = arr.length;
        int max = 0;
        int cmax = 0;
        int sign = -1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                cmax = (sign==0)?cmax+1:1;
                sign = 1;
            }else if(arr[i]<arr[i+1]){
                cmax = (sign==1)?cmax+1:1;
                sign = 0;
            }else{
                cmax=0;
                sign =-1;
            }
            max = Math.max(cmax,max);
        }
        return max+1;
    }
}


/*
[2,4,3,5,2,2,5,1,4]
[0,1,2,3,4,5,6,7]

*/
