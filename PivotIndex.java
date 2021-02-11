package org.GoldManSachs;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
int sum=0;
for(int num:nums)
{
    sum+=sum;
}
int leftSum=0; int rightSum=sum;
for(int i=0;i<nums.length;i++)
{
    rightSum-=nums[i];
    if(leftSum==rightSum)
    {
        return i;
    }
    leftSum+=nums[i];
}
return -1;
    }

    public static void main(String[] args) {
        PivotIndex pivotIndex=new PivotIndex();
        int[]nums={1,7,3,6,5,6};
        System.out.println(pivotIndex.pivotIndex(nums));
    }
}
