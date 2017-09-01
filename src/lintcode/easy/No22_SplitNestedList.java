package lintcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个列表，该列表中的每个要素要么是个列表，要么是整数。将其变成一个只包含整数的简单列表。
 * @author Administrator
 *样例
 *	给定 [1,2,[1,2]]，返回 [1,2,1,2]。
 *
 *	给定 [4,[3,[2,[1]]]]，返回 [4,3,2,1]。
 */
public class No22_SplitNestedList {
	// @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
    	if(nestedList == null) {
    		return null;
    	}
    	List<Integer> result = new ArrayList<>();
    	getResultRecursive(result, nestedList);
    	return result;
    }

	private void getResultRecursive(List<Integer> result, List<NestedInteger> nestedList) {
		for(NestedInteger ni : nestedList) {
			if(ni.isInteger()) {
				result.add(ni.getInteger());
			}else {
				getResultRecursive(result, ni.getList());
			}
		}
	}
	
	private void getResultUnRecursive(List<Integer> result, List<NestedInteger> nestedList) {
		
		
	}
}

interface NestedInteger {

     // @return true if this NestedInteger holds a single integer,
     // rather than a nested list.
     public boolean isInteger();

     // @return the single integer that this NestedInteger holds,
     // if it holds a single integer
     // Return null if this NestedInteger holds a nested list
     public Integer getInteger();

     // @return the nested list that this NestedInteger holds,
     // if it holds a nested list
     // Return null if this NestedInteger holds a single integer
     public List<NestedInteger> getList();
 }
