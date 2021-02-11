package org.GoldManSachs;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    public int[] twosum(int[]nums,int target)
    {
        Map<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                int complement=target-nums[i];
                if(map.containsKey(complement))
                {
                    return new int[]{map.get(complement),i};
                }
                map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSumHashMap hashMap=new TwoSumHashMap();
        int nums[]={3,2,4};
        int target=6;
        System.out.println(hashMap.twosum(nums,target));
    }
}
