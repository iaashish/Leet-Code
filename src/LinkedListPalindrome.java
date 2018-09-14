
public class LinkedListPalindrome {
    
	public static ListNode reverse(ListNode headone){

		ListNode prev = null;
        while(headone != null){
        	ListNode n = new ListNode(headone.val);
        	n.next = prev;
        	prev = n;
        	headone = headone.next;
        }
        
        return prev;
        
    }
    
    public boolean isPalindrome(ListNode head) {
    	
        ListNode reverseNode = reverse(head);
        if(reverseNode.equals(head)){
            return true;
        }
        return false;
    }
    
    public boolean equal(ListNode n1, ListNode n2) {
    	while(n1!=null || n2!=null) {
    		if(n1.val!=n2.val) {
    			return false;
    		}
    		n1 = n1.next;
    		n2 = n2.next;
    	}
    	return true;
    }
	public static void main(String args[]) {
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(2);
		l1.next.next.next = new ListNode(2);
        LinkedListPalindrome l3 = new LinkedListPalindrome();
        l3.isPalindrome(l1);
	}
	
}
