package tree;

import java.util.Objects;

public class Traversal {

    public static void main(String[] args) {
        TreeNode e = new TreeNode(4, null, null);
        TreeNode f = new TreeNode(5, null, null);
        TreeNode a = new TreeNode(1, e, f);
        TreeNode c = new TreeNode(3, null, null);
        TreeNode b = new TreeNode(2, a, c);
//        preOrderTraversalRecursion(b);
        PreOrderTraversal(b);
    }

    public static void preOrderTraversalRecursion(TreeNode root) {
        // 叶子节点
        if (Objects.nonNull(root)) {
            System.out.println("value=" + root.getValue());
            preOrderTraversalRecursion(root.getLeft());
            preOrderTraversalRecursion(root.getRight());
        }
    }

    public static void PreOrderTraversal(TreeNode root) {
        if (Objects.nonNull(root)) {
            System.out.println("value=" + root.getValue());
            TreeNode left = root.getLeft();
            TreeNode right = root.getRight();
            while (Objects.nonNull(left)) {
                System.out.println("value=" + left.getValue());
                left = left.getLeft();
            }
            while (Objects.nonNull(right)) {
                System.out.println("value=" + right.getValue());
                right = right.getLeft();
            }
        }
    }
}
