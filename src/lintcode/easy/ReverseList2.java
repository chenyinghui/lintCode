package lintcode.easy;

/**
 * 翻转链表中第m个节点到第n个节点的部分
	
	 注意事项

	m，n满足1 ≤ m ≤ n ≤ 链表长度
 * 样例  给出链表1->2->3->4->5->null， m = 2 和n = 4，返回1->4->3->2->5->null
 * @author Administrator
 */
public class ReverseList2 {

	/**
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
    	if(head == null || head.next == null || m == n){
    		return head;
    	}
    	int index = 0;
    	ListNode subhead = head; 
    	ListNode combine = null;//需要接装换后的节点
    	while(++index != m){
    		combine = subhead;
    		subhead = subhead.next;
    	}
    	ListNode newSubhead = reverse(subhead, m, n);
    	if(combine != null){
    		combine.next = newSubhead;
    		return head;
    	}else{
    		head = newSubhead;
    	}
    	return head;
    }
    
    public ListNode reverse(ListNode head, int start, int end) {
    	if(head == null || head.next == null){
    		return head;
    	}
    	ListNode newhead = null;
    	while(head.next != null){
    		if(newhead == null){
    			newhead = head.next;
    			ListNode third = newhead.next;
    			head.next = third;
    			newhead.next = head;
    		}else{
    			ListNode second = head.next;
    			ListNode third = second.next;
    			second.next = newhead;
    			newhead = second;
    			head.next = third;
    		}
    		if(++start >= end){
    			break;
    		}
    	}
    	return newhead;
    }
	
}

class ListNode2 {
	int val;
	ListNode next;

	ListNode2(int val) {
		this.val = val;
		this.next = null;
	}
}
