//You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
//f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.

//For example,

//A=[1, 3, -1]

//f(1, 1) = f(2, 2) = f(3, 3) = 0
//f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
//f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
//f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

//So, we return 5.

public class Solution {
    public int maxArr(int[] A) {
        int max=0;
        int min1= Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;
        int max1= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            min1=Math.min((A[i]-i),min1);
            max1=Math.max((A[i]-i),max1);
            min2=Math.min((A[i]+i),min2);
            max2=Math.max((A[i]+i),max2);
        }
        max=Math.max((max1-min1),(max2-min2));
        return max;
        
    }
}
