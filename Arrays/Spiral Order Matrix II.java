/* Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

Example:

Given n = 3,

You should return the following matrix:

[
  [ 1, 2, 3 ],
  [ 8, 9, 4 ],
  [ 7, 6, 5 ]
]
*/

public class Solution {
    public int[][] generateMatrix(int A) {
        int k=A;
        int[][] a=new int[k][k];
        int l=0;
        int sum=1;
        int n=a.length;
        if(k==1){
            a[0][0]=1;
            return a;
        }
        while(l<k-2){
            for(int i=l;i<n-l;i++){
                a[l][i]=sum;
                sum++;
            }

            for(int j=l+1;j<n-l;j++){
                a[j][n-1-l]=sum;
                sum++;
            }
            for(int i=n-2-l;i>=l;i--){
                a[n-1-l][i]=sum;
                sum++;
            }
            for(int j=n-2-l;j>=l+1;j--){
                a[j][l]=sum;
                sum++;
            }
            l++;
            int t=k/2;
            if(a[t][t]==0&&(k%2==1)){
            a[t][t]=sum;
        }
        }
        return a;
    }
}
