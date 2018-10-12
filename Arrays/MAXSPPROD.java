/* You are given an array A containing N integers. The special product of each ith integer in this array is defined as the product of the following:<ul>

LeftSpecialValue: For an index i, it is defined as the index j such that A[j]>A[i] (i>j). If multiple A[j]’s are present in multiple positions, the LeftSpecialValue is the maximum value of j. 

RightSpecialValue: For an index i, it is defined as the index j such that A[j]>A[i] (j>i). If multiple A[j]s are present in multiple positions, the RightSpecialValue is the minimum value of j.

Write a program to find the maximum special product of any integer in the array.

Input: You will receive array of integers as argument to function.

Return: Maximum special product of any integer in the array modulo 1000000007.
*/

public class Solution {
    public int maxSpecialProduct(int[] A) {
        long max=0;
        for(int i=0;i<A.length;i++){
            long m=left(A,i)*right(A,i);
            if(m>max){
                max=m;
            }
        }
        return (int)(max % 1000000007L);
    }
    public long left(int[] A,int i){
        for(int j=i-1;j>=0;j--){
            if(A[j]>A[i]){
                return j;
            }
        }
        return 0;
    }
    public long right(int[] A,int i){
        for(int j=i+1;j<A.length;j++){
            if(A[j]>A[i]){
                return j; 
            }
        }
        return 0;
    }
}
