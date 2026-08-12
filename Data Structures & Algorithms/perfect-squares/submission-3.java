class Solution {
    int arr[] = new int[10001];
    
    public int numSquares(int n) {
        if(n==0){
            return 0;
        }
        Arrays.fill(arr,-1);
        return solve(n);

    }
    public int solve(int n){
        if(n==0){
            return 0;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        int res=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int temp = 1+solve(n-i*i);
            res = Math.min(res,temp);
            arr[n] = res;
        }
        return res;
    }
}