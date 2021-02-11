package org.GoldManSachs;

public class ClimbStairs {
    public int Climb(int n)
    {
        return cs(0,n);
    }
    public int cs(int i,int n)
    {
        if(i>n)
        {
            return 0;
        }
        if(i==n)
        {
            return 1;
        }
        return cs(i+1,n)+cs(i+2,n);
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs=new ClimbStairs();
        System.out.println(climbStairs.Climb(2));
    }
}
