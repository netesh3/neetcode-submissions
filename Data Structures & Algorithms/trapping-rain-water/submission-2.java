class Solution {
    // public int trap(int[] height) {
    //     int left[] = new int[height.length];
    //     int right[] = new int[height.length];
    //     left[0]= height[0];
    //     int last = height.length-1;
    //     right[last] = height[height.length-1];
    //     for(int i=1;i<height.length;i++){
    //         // left[i] = Math.max(height[i],left[i-1]);
    //         right[height.length-1-i] = Math.max(height[height.length-1-i],right[height.length-i]);
    //     }
    //     System.out.println(Arrays.toString(left) + " T "+ Arrays.toString(right));
    //     int res = 0;
    //     int leftMax = 0;
    //     for(int i=0;i<height.length;i++){
    //         if(height[i]>leftMax){
    //             leftMax = height[i];
    //         }
    //         res += Math.abs(Math.min(leftMax,right[i])-height[i]);
    //         System.out.println("R "+ res);
    //     }

    //     return res;
    // }

    public int trap(int[] height) {
        if(height.length < 2){
            return 0;
        }
        int left = height[0];
        int right = height[height.length-1];
        int l = 0;
        int r = height.length-1;
        int res = 0;
        while(l<r){
            if(left<right){
                l++;
                left = Math.max(height[l],left);
                res+=left-height[l];
                
            }else {
                r--;
                right = Math.max(height[r],right);
                res+=right-height[r];
            }
        }
        return res;
    }
}


/*
int max = 0;
[3,3,3,3,3,3,3,3,2,1]
======================
[0,2,0,3,1,0,1,3,2,1]
 l
0+0

0,1,2,3,4
    i   j

res = 0;
keep moving j until it find more then i height + j < height.length
kepp calculating the result by diff from j height to i height;


*/