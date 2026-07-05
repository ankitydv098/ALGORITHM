class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;


       
        ListNode slow = dummy;
        ListNode temp = head;

        int length = 0;

        while(temp!=null){
            length++;
            temp=temp.next;
        }


        // fast ko n steps aage bhejo
        for(int i = 0; i <length- n; i++){

            slow=slow.next;
        }


       


        // delete node
        slow.next = slow.next.next;


        return dummy.next;
    }
}