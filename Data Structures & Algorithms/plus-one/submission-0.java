class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] res= new int[digits.length+1];
        System.out.println(Arrays.toString(res) +" C ");
        res[0]=1;
        System.out.println(Arrays.toString(res) +" C Next ");
        return res;
    }
}

//10000