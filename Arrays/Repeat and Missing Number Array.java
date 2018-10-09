//You are given a read only array of n integers from 1 to n.

//Each integer appears exactly once except A which appears twice and B which is missing.

//Return A and B.

//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

//Note that in your output A should precede B.

//Example:

//Input:[3 1 2 5 3] 

//Output:[3, 4] 

//A = 3, B = 4

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] a) {
        long sum=(long)a.length*(long)(a.length+1)/2;
        long product=(long)a.length*(long)(a.length+1)*(2*(long)a.length+1)/6;
        for(int i=0;i<a.length;i++){
            sum=sum-(long)a[i];
            product=product-(long)a[i]*(long)a[i];
        }
        long plus=product/sum;
        int[] arr=new int[2];
        arr[0]=(int)(plus-sum)/2;
        arr[1]=(int)(plus+sum)/2;
        return arr;
    }
}