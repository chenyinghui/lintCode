package lintcode.easy;

import java.util.ArrayList;

/**
 * @author Administrator 给出一个无重叠的按照区间起始端点排序的区间列表。
 *         在列表中插入一个新的区间，你要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 *         样例 插入区间[2, 5] 到 [[1,2], [5,9]]，我们得到 [[1,9]]。 插入区间[3, 4] 到 [[1,2],
 *         [5,9]]，我们得到 [[1,2], [3,4], [5,9]]。
 */

class Interval {
	int start, end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
	
public class No30_MergeInterval {
    /*
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
    	if(intervals == null || intervals.isEmpty()) {
    		return intervals;
    	}
    	ArrayList<Integer> result = new ArrayList<>();
    	return null;
    }
}
