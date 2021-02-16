package org.TopLeetcode;

public class LinkedListCycleII_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;
        if(head==null || head.next==null)
        {
            isCycle = false;
        }
        while(fast!=null && fast.next!=null && slow!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
            {
                isCycle = true;
                break;
            }
        }

        if(!isCycle)
        {
            return null;
        }
        fast = head;
        while(slow!=fast)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
    }

