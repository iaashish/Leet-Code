
public class MergeSortedLists {

	public static void main(String args[]) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(1);
		a1.next = new ListNode(2);
		a1.next.next = new ListNode(3);

		a2.next = new ListNode(3);
		a2.next.next = new ListNode(4);

		ListNode result = new ListNode(0);
		ListNode a = result;

		while (a1 != null && a2 != null) {
			if (a1.val <= a2.val) {
				a.next = a1;
				a1 = a1.next;
			} else {
				a.next = a2;
				a2 = a2.next;
			}
			a = a.next;

		}
		if (a1 == null) {
			a.next = a2;
		}
		if (a2 == null) {
			a.next = a1;
		}
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		this.val = x;
	}
}
