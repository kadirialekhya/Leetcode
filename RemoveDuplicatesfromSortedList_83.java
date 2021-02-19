package org.TopLeetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RemoveDuplicatesfromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
ListNode current=head;
while(current!=null&&current.next!=null)
{
    if(current.next.val== current.val)
    {
        current.next=current.next.next;
    }
    else
    {
        current=current.next;
    }
}
return head;
    }

    @Override
    public String toString() {
        Collections.sort(null);
        return super.toString();
    }
}
