class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        left[0]= height[0];
        int last = height.length-1;
        right[last] = height[height.length-1];
        for(int i=1;i<height.length;i++){
            // left[i] = Math.max(height[i],left[i-1]);
            right[height.length-1-i] = Math.max(height[height.length-1-i],right[height.length-i]);
        }
        System.out.println(Arrays.toString(left) + " T "+ Arrays.toString(right));
        int res = 0;
        int leftMax = 0;
        for(int i=0;i<height.length;i++){
            if(height[i]>leftMax){
                leftMax = height[i];
            }
            res += Math.abs(Math.min(leftMax,right[i])-height[i]);
            System.out.println("R "+ res);
        }

        return res;
    }
}


/*
int max = 0;

[3,3,3,3,3,3,3,3,2,1]
======================
[0,0,2,0,2,3,2,0,0,0=9




*/