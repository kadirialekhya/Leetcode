package org.GoldManSachs;

public class RobotOrigin {
    public boolean robot( String moves)
    {
        int x=0; int y=0;
        for(char move: moves.toCharArray())
        {
            if(move=='U')
            {
y--;
            }
            else if (move=='D')
            {
                y++;
            }
            else if(move=='L')
            {
                x--;
            }
            else {
                x++;
            }
        }
        return x==0&&y==0;
    }

    public static void main(String[] args) {
        RobotOrigin robotOrigin=new RobotOrigin();
        System.out.println(robotOrigin.robot("LL"));
    }
}
