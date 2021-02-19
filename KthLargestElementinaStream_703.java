package org.TopLeetcode;

import java.util.PriorityQueue;

public class KthLargestElementinaStream_703 {
    private PriorityQueue<Integer>pq;
    private int K;
    public void KthLargest(int k, int[] nums) {
this.pq=new PriorityQueue<>();
this.K=K;
for(int i=0;i<nums.length;i++)
{
    add(nums[i]);
}
    }

    public int add(int val) {
pq.offer(val);
if(pq.size()>K)
    pq.poll();
return pq.poll();
    }
}
