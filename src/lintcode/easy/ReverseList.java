package lintcode.easy;

/**
 * 样例 给出一个链表1->2->3->null，这个翻转后的链表为3->2->1->null
 * 
 * @author Administrator
 *
 */
public class ReverseList {

	/**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     * 挑战  : 在原地一次翻转完成
     */
    public ListNode reverse(ListNode head) {
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
    	}
    	return newhead;
    }
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}
