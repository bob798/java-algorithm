##树
联系：现实中的树
###概念
根节点、子节点、叶子节点
###使用
遍历方法：深度优先（依据节点的未知分为前、中、后），广度优先
方式：递归、非递归

## 前序遍历

### 递归算法
```
public static void preOrderTraversalRecursion(TreeNode root) {
        // 叶子节点
        if (Objects.nonNull(root)) {
            System.out.println("value=" + root.getValue());
            preOrderTraversalRecursion(root.getLeft());
            preOrderTraversalRecursion(root.getRight());
        }
    }

```

### 非递归算法
1. 先遍历根节点
2. 遍历节点的左子树，直至叶子节点。
3. 遍历节点的右子树，
4. 使用栈进行右子树回溯
算法框架：？

## 相关知识
### 回溯法
回溯法采用试错的思想，它尝试分步的去解决一个问题。在分步解决问题的过程中，当它通过尝试发现，现有的分步答案不能得到有效的正确的解答的时候，它将取消上一步甚至是上几步的计算，再通过其它的可能的分步解答再次尝试寻找问题的答案。
https://zh.wikipedia.org/wiki/%E5%9B%9E%E6%BA%AF%E6%B3%95
算法框架：https://labuladong.gitee.io/algo/1/4/