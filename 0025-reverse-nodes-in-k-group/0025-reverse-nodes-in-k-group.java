class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }
        if(count < k){
            return head;
        }
        ListNode prev = null;
        curr = head;
        for(int i = 0; i<k; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = reverseKGroup(curr, k);
        return prev;

        
    }
}