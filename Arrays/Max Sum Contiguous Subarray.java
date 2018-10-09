//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

//For example:

//Given the array [-2,1,-3,4,-1,2,1,-5,4],

//the contiguous subarray [4,-1,2,1] has the largest sum = 6.

//For this problem, return the maximum sum.

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public long maxSubArray(final int[] a) {
        long sum=0;
        long max=a[0];
        for(int i=0;i<a.length;i++){
            sum=Math.max(a[i],sum+a[i]);
            if(sum>max){
                max=sum;
            }
            
        }
        return max;
    }
}