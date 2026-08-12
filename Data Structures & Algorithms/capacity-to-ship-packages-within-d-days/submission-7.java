class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>min){
                min = weights[i];
            }
            max += weights[i];
        }

        // Arrays.sort(weights);

        int start = min;
        int end = max;
        int res = end;
        while(start<=end){
            int mid = start+(end-start)/2;
            int temp = load(weights,mid);
            if(temp<=days){
                res = Math.min(res,mid);
            }
            if(temp>days){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return res;

    }

    public int load2(int [] weights, int mid){
        int count = 1;
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]<=mid){
                sum += weights[i];
            }else{
                count++;
                sum = weights[i];
            }
        }
        return count;
    }

    public int load(int [] weights, int mid){
        int count = 0;
        for(int i=0;i<weights.length;){
            int sum = 0;
            while(i<weights.length && sum+weights[i]<=mid){
                sum += weights[i];
                i++;
            }
            System.out.println(sum + " T "+ mid);
            if(sum==0){
                i++;
            }
            count++;
        }
        System.out.println("new");
        return count;
    }


}

/*

 [1,5,4,4,2,3], days = 3
 mid = 4 c = 2
1,2,3,4,4]

min = max(arr);
max = sum(arr);

output: 5

Explanation:
1st day = [1]
2nd day = [5]
3rd day = [4]




*/