
public class RemovDuplicates {

	public static void main(String args[]) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(1);
		l1.next.next.next = new ListNode(2);
		l1.next.next.next.next = new ListNode(3);
		l1.next.next.next.next.next = new ListNode(3);
		l1.next.next.next.next.next.next = new ListNode(4);

		ListNode curr = l1;
		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		System.out.println("fsaf");
	}
}
