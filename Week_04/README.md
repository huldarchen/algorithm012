## 深度优先(DFS)

```java
//树的层序遍历
public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null){
            return allResults;
        }
        travel(root, 0, allResults);
        return allResults;
    }


    private void travel(TreeNode root,int level,List<List<Integer>> results) {
        if (results.size() == level) {
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        if (root.left != null) {
            travel(root.left, level+1, results);
        }
        if (root.right != null) {
            travel(root.right, level+1, results);
        }
    }
```

## 广度优先(BFS)

```java
//树的层序遍历
public List<List<Integer>> levelOrder(TreeNode root) {
  List<List<Integer>> allResults = new ArrayList<>();
  if (root == null) {
    return allResults;
  }
  Queue<TreeNode> queue  = new LinkedList<>();
  queue.add(roow);
  while (!queue.isEmpty()) {
    int size = queue.size();
    List<Integer> level = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      TreeNode node = queue.poll();
      level.add(node.val);
      if (node.left != null) {
        queue.add(root.left);
      }
      if (node.right != null) {
        queue.add(root.right);
      }
    }
    allResults.add(level);
  }
  return allResults;
}
```



## 贪心算法

贪心算法是一种在每一步选择中都采取在当前状态下最好或最优(即最有利)的选择,从而希望导致结果是全局最好或最优的算法.

与动态规划的却别在于

1. 贪心算法对每个子问题都作出选择,不能回溯
2. 动态规划对每个子问题会保存一千运算的结果,并根据之前的结果对当前进行选择,有回退功能

贪心算法适用于**最优子结构**问题,如兑换的硬币20 10 5 存在倍数关系的.

## 二分查找

```java

public int bsearch(int[] a, int n, int value) {
  int low = 0;
  int high = n - 1;

  while (low <= high) { //判断条件
    int mid = (low + high) / 2; //数据越界
    if (a[mid] == value) {
      return mid;
    } else if (a[mid] < value) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }

  return -1;
}
```

**一定要注意二分查找的退出条件**

