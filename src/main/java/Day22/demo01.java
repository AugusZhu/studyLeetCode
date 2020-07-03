package Day22;

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class demo01 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        /*
            这个主要是使用arrayList来实现一个队列，然后每次访问一个吧一个结点入队列，然后判断这个结点是否有左右子结点，如果有，则把这个左子节点放入这个队列。
            如果有右子树，把这个右子结点也放入到这个队列当中，然后每次取出来的也是这个队列的第一个结点。
        */
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<TreeNode> node = new ArrayList<TreeNode>();
        if(root == null){
            return list;
        }
        node.add(root);
        while(node.size() > 0){
            TreeNode treeNode = node.remove(0);
            if(treeNode.left != null){
                node.add(treeNode.left);
            }
            if(treeNode.right != null){
                node.add(treeNode.right);
            }
            list.add(treeNode.val);
        }
        return list;
    }


    public static void main(String[] args) {
        demo01 d1 = new demo01();
        int[] nums = {-10,-3,0,5,9};
        ArrayList<Integer> list = new ArrayList<Integer>();

        list = d1.PrintFromTopToBottom(d1.sortedArrayToBST(nums));

        System.out.println(list);

    }

}
