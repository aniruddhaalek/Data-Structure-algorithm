/* Given a collection of intervals, merge all overlapping intervals.

For example:

Given [1,3],[2,6],[8,10],[15,18],

return [1,6],[8,10],[15,18].

Make sure the returned intervals are sorted.
*/
 
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    class SortBy implements Comparator<Interval>{
        public int compare(Interval a,Interval b){
            if(a.start==b.start){
                return b.end-a.end;
            }
            return a.start - b.start;
        }
    }
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        int n = intervals.size();
        if(n==0||n==1){
            return intervals;
        }
        Collections.sort(intervals,new SortBy());
        for(int i=0;i<intervals.size();i++){
            int end = intervals.get(i).end;
            i++;
            while(i<intervals.size()&&end>=intervals.get(i).start){
                end = Math.max(intervals.get(i).end,end);
                intervals.remove(i);
            }
            i--;
            intervals.get(i).end = end;
        }
        return intervals;
    }
}
