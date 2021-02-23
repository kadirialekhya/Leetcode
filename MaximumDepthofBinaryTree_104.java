package org.TopLeetcode;

public class MaximumDepthofBinaryTree_104 {
    public int maxDepth(TreeNode root) {
if(root== null)
{
    return 0;
}
if(root.left==null && root.right==null)
{
    return 0;
}
int leftMaxDepth=1+maxDepth(root.left);
int rightMaxDepth=1+maxDepth(root.right);
return Math.max(leftMaxDepth,rightMaxDepth);
    }

    public static void main(String[] args) {

    }
}
