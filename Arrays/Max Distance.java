/* Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].

If there is no solution possible, return -1.

Example :

A : [3 5 4 2]

Output : 2 
for the pair (3, 4)
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> a) {
	    if (a == null || a.size() == 0) return -1;

	    boolean[] isMin = new boolean[a.size()];
	    int min = a.get(0);
	    int maxDistance = 0;
		int i = a.size()-1;
    	int j = a.size()-1;
    
	    for(i = 0; i < a.size(); i++){
	        if (a.get(i) <= min){
	            min = a.get(i);
	            isMin[i] = true;
	        }
	    }
	    i--;

	    while (i >= 0){
	    	if (!isMin[i]) i--;
	    	else {
	    		while (a.get(i) > a.get(j) && j > i){
		    		j--;
		    	}
		    	if ( j - i > maxDistance) maxDistance = j - i;
		    	i--;
	    	}
	    }

	    return maxDistance;
	}
}
