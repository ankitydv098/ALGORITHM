class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p1 = l1;
        ListNode p2 = l2;

        int carry = 0;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;


        while(p1 != null || p2 != null){

            int sum = carry;

            if(p1 != null){
                sum += p1.val;
                p1 = p1.next;
            }

            if(p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }


            int digit = sum % 10;
            carry = sum / 10;


            ListNode newNode = new ListNode(digit);

            curr.next = newNode;
            curr = curr.next;

        }


        if(carry > 0){
            curr.next = new ListNode(carry);
        }


        return dummy.next;
    }
}