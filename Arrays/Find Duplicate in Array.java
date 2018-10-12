/*Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]
Sample Output:

1
If there are multiple possible answers ( like in the sample case above ), output any one.

If there is no duplicate, output -1
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    Map<Integer,Integer> m=new HashMap<Integer,Integer>();
	    ArrayList<Integer> ans=new ArrayList<Integer>();
         for(Integer i:a){
             if(m.containsKey(i)){
                 ans.add(i);
             }
             else{
                 m.put(i,i);
             }
         }
         if(ans.size()==0){
             return -1;
         }
         else{
             return ans.get(0);
         }
	}
}
