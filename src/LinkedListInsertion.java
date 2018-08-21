

public class LinkedListInsertion {

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static ListNode reverse(ListNode l1, int m, int n) {

		ListNode start = null;
		ListNode end = null;
		ListNode middle = null;
		int count = 1;
		ListNode dummy = l1;
		int nodestobereversed = n-m+1;
		while (dummy != null && count < m) {
			dummy = dummy.next;
			count++;
		}
		
		while (count != n+1) {
			middle = insertInFront(dummy.data, middle);
			dummy = dummy.next;
			count++;
		}
		while (dummy != null) {
			end = insertInEnd(dummy.data, end);
			dummy = dummy.next;
		}
		
		return null;
	}
	static ListNode insertInFront(int data, ListNode ln) {
		ListNode l1 = new ListNode(data);
		l1.next = ln;
		ln = l1;
		return ln;
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
		
		ListNode begin = null;
		ListNode end = null;
		for(int i=1;i<=5;i++) {
			begin = insertInEnd(i, begin);
		}
		
		ListNode l1 = reverse(begin, 2, 4);
		

	}
}
