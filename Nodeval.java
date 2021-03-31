package org.TopJavaInterviewQuestions;

public class Nodeval {
    int count=0;
    public int goodNodes(TreeNode root)
    { if (root == null) {
        return count;
    }

    dfs(root, root.val);
        return count;

}
    private void dfs(TreeNode root,int max)
    {
        if(root.val>=max){
            count=count+1;
        }

        if(root.left!=null)
        { dfs(root.left,Math.max(max, root.val));
        }
        if  (root.right!=null)
        {
            dfs(root.right,Math.max(max, root.val));
        }
    }
}
