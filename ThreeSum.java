//package org.GoldManSachs;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//public class ThreeSum {
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> output_arr=new LinkedList<>();
//        for(int i=0; i<nums.length-2; i++)
//        {
//            if(i==0||nums[i]!=)
//        }
//            int low=i+1;
//            int high=nums.length-1;
//            int sum=0-nums[i];
//
//            while (low<high)
//            {
//                if(nums[low]+nums[high]==sum)
//                {
//                    output_arr.add(Array.asList(nums[i],nums[low],nums[high]));
//                    while (low<high&&nums[low]==nums[low+1])low++;
//                    while(low<high && nums[high]==nums[high-1])high--;
//                    low++;
//                    high--;
//                }
//                else if(nums[low]+nums[high]>sum)
//                {
//                    high--;
//                }
//                            else
//                {
//                    low++;
//                }
//        }
//
//    }
//}
