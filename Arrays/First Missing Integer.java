/* Given an unsorted integer array, find the first missing positive integer.

Example:

Given [1,2,0] return 3,

[3,4,-1,1] return 2,

[-8, -7, -6] returns 1

Your algorithm should run in O(n) time and use constant space.
*/

public class Solution {
    public int firstMissingPositive(int[] a) {
        Map<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            hs.put(a[i],1);
        }
        int j=1;
        while(true){
            if(hs.containsKey(j)){
                j++;
            }
            else{
                return j;
            }
        }
    }
}
