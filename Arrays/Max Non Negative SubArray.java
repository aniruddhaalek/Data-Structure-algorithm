/*Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:

A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3] */

public class Solution {
    public int[] maxset(int[] A) {
        ArrayList<Integer> t=new ArrayList<Integer>();
         ArrayList<Integer> arr=new ArrayList<Integer>();
         long sum=0;
         long max=-1;
        for(int i=0;i<A.length;i++){
            if(A[i]>=0){
                arr.add(A[i]);
                sum+=A[i];
                if((sum>max)||((sum==max)&&(arr.size()>t.size()))){
                    max=sum;
                    t=new ArrayList<Integer>(arr);
                }
            }
            else{
                arr=new ArrayList<Integer>();
                sum=0;
            }
        }
        int [] ans=new int[t.size()];
        int count=0;
        for(int i:t){
            ans[count]=i;
            count++;
        }
        return ans;
    }
}
