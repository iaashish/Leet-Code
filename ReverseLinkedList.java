
public class ReverseLinkedList {

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static ListNode reverse(ListNode head, int m, int n) {
			ListNode prev = null,  next = null, leftnode = new ListNode(0);
			ListNode Last = null;
			ListNode end = head;
			int count = 1;
			int tobereversed = n-m+1;
			ListNode curr= new ListNode(0);
			curr.next = head;
			leftnode.next = head;
			if(m==n) {
				return head;
			}
			
			//Get up to the point m
			while(count < m) {
				leftnode = leftnode.next.next;
				curr = curr.next.next;
				count++;
			}
			count = 1;
			while(count<=n) {
				end = end.next;
				count++;
			}
			
			ListNode dummy = new ListNode(0);
			dummy.next = curr.next;
			dummy = dummy.next;
			
			

			while(count <= tobereversed) {
				count++;
				next = dummy.next; // after first element
				dummy.next = prev;
				prev = dummy;//first element;
				dummy = next;
				if(count == tobereversed) {
//					head = prev;
					curr.next = prev;
					break;
				}
			}
			
			if(leftnode != null) {
				leftnode.next = head;
				return leftnode;
			}
		return head;
	}
	static ListNode insertInEnd(int data, ListNode ln) {
		if(ln == null) {
			return new ListNode(data);
		}
		
		ListNode dummy = ln;
		while(dummy.next != null) {
			dummy = dummy.next;
		}
		dummy.next = new ListNode(data);
		return ln;
	}
	public static void main(String args[]) {
		ReverseLinkedList rll = new ReverseLinkedList();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		rll.reverse(l1, 1, 2);
		
	}

}
