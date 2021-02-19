package org.TopLeetcode;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements_347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>occurences=new HashMap<>();
        for(int n:nums)
        {
            Integer integer=occurences.get(n);
            if(integer==null)
            {
                occurences.put(n,1);
            }
            else
            {
                occurences.put(n,integer+1);
            }
        }
        Queue<Integer>heap=new PriorityQueue<>((a,b)->occurences.get(b)-occurences.get(a));
        for(int key:occurences.keySet())
        {
            heap.add(key);
        }
        int[]ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=heap.poll();
        }
        return ans;
    }
}
