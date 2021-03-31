package org.TopJavaInterviewQuestions;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode()
    {

    }
    TreeNode(int val)
    {
        this.val=val;
    }
    TreeNode(int val,TreeNode right,TreeNode left)
    {
        this.val=val;
        this.right=right;
        this.left=left;

    }
}
