//TC: O(H); given the amount of height of the BST;
//SC: O(1) as no extra DS is used to return the sum other than a variable;

class Solution {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        helper(root,0);
        //Calling helper function and the func does not end until manipulating the value of the gloabl varialble sum declared;
        return sum;
    }
    private void helper(TreeNode root, int currSum){
        //base case:
        if(root==null){
            return;
        }
        
        //Always the base case will be when root ==null can write null when root.left==null and root.right==null;
        //when you knw the sum to reach on both the ends has been reached;
        
        if(root.left==null && root.right==null){
            sum=sum+currSum*10+root.val;        //Comes here only when the traverse has reached to the leaf of the tree;
            return;
            //can write return here as well, as th ebase case of reaching the leaf will be there always;
        }
        helper(root.left,currSum*10+root.val);
        helper(root.right,currSum*10+root.val);
        
    }
}
