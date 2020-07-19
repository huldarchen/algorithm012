# 学习目标

1. 哈希表,映射.hash**碰撞**解决办法
2. 树,二叉树,二叉搜索树
3. 堆,**TOPn**

## 哈希表

hash是K,V结构,底层是通过数组实现的,将K进行hash运算得到下标,利用数组下标快速访问元素.

使用hash算法生成下标,必然会存在**hash碰撞**(hash值一样),解决hash碰撞的方法一般有2种

1. 开放寻址法
2. 拉链式

时间复杂度分析: 查,插,删平均时间复杂度是O(1) 最坏时间复杂度是O(n[lg n]) 根据具体实现有所不同

Java HashMap的put方法

```java
public V put(K key, V value) {
    return putVal(hash(key), key, value, false, true);
}
```

```java
final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
               boolean evict) {
    Node<K,V>[] tab; Node<K,V> p; int n, i;
    //hash表为null或者长度为0 初始化tab
    if ((tab = table) == null || (n = tab.length) == 0)
        n = (tab = resize()).length;
    //根据是否发生hash碰撞进行对应的处理
    if ((p = tab[i = (n - 1) & hash]) == null)
        //没有发生hash碰撞直接赋值给对应的下标
        tab[i] = newNode(hash, key, value, null);
    else {//发生了hash碰撞
        Node<K,V> e; K k;
        if (p.hash == hash &&
            ((k = p.key) == key || (key != null && key.equals(k))))
            //如果插入的值和所在的值地址完全一样 直接返回 不需要进行更新
            e = p;
        else if (p instanceof TreeNode)
           //碰撞的第一个节点是(红黑)树,那么改节点以后一直是树类型,将要插入的值插入到树中
            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        else {
           //如果是碰撞的节点是链表
            for (int binCount = 0; ; ++binCount) {
                if ((e = p.next) == null) {
                  	//后继节点是为null直接插入
                    p.next = newNode(hash, key, value, null);
                  	//要判断链表长度是否大于树的阈值 就将链表转化为树
                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                        treeifyBin(tab, hash);
                    break;
                }
              	//和上面一样 如果完全一样
                if (e.hash == hash &&
                    ((k = e.key) == key || (key != null && key.equals(k))))
                    break;
                p = e;
            }
        }
      	//e 是碰撞的元素
        if (e != null) { // existing mapping for key
            V oldValue = e.value;
            //onlyIfAbsent是方法的调用参数，表示是否替换已存在的值
            // 在默认的put方法中这个值是false，所以这里会用新值替换旧值
            if (!onlyIfAbsent || oldValue == null)
                e.value = value;
            afterNodeAccess(e);
            return oldValue;
        }
    }
    //操作计数器
    ++modCount;
    //如果下一个元素达到扩容的阈值进行扩容
    if (++size > threshold)
        resize();
  	//hashmap 是个空函数
    afterNodeInsertion(evict);
    return null;
}
```

HashMap的get的

```java
final Node<K,V> getNode(int hash, Object key) {
  	//first 是链表的头节点
    Node<K,V>[] tab; Node<K,V> first, e; int n; K k;
  	//tab不能为null,tab的长度不为0,hash的对应下标不为null
    if ((tab = table) != null && (n = tab.length) > 0 &&
        (first = tab[(n - 1) & hash]) != null) {
        //hash碰撞 解决办法
      	//如果头节点和要查询的节点完全一样 直接返回
        if (first.hash == hash && // always check first node
            ((k = first.key) == key || (key != null && key.equals(k))))
            return first;
        if ((e = first.next) != null) {
          	//如果是树,获取树的节点
            if (first instanceof TreeNode)
                return ((TreeNode<K,V>)first).getTreeNode(hash, key);
            do {//链表遍历查找
                if (e.hash == hash &&
                    ((k = e.key) == key || (key != null && key.equals(k))))
                    return e;
            } while ((e = e.next) != null);
        }
    }
    return null;
}
```

## set

元素进行去重,底层实现是通过HashMap实现的.

## Tree

### 基本

**linked list**是特殊化的**tree**

**tree**是特殊化的**graph**

相关概念 树,二叉树,二叉查找树,完全二叉树

**相关属性**

1. 根节点,父节点,子节点,叶子节点
2. 高度,深度,层数

**遍历**

**根** 左 右------->前序遍历

```java
public List<Integer> preorderTraversal(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalLoop(root, result);
        return result;
    }

 private void preorderTraversalLoop(BinaryTreeNode treeNode, List<Integer> result) {
        if (treeNode == null) {
            return;
        }
   			//根  左 右
        result.add(treeNode.val);
        preorderTraversalLoop(treeNode.left, result);
        preorderTraversalLoop(treeNode.right, result);
    }
```

左 **根** 右------->中序遍历

```java
public List<Integer> inorderTraversal(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        inorderTraversalLoop(root, result);
        return result;
    }

 private void inorderTraversalLoop(BinaryTreeNode treeNode, List<Integer> res) {
        if (treeNode == null) {
            return;
        }
   			//左  根   右
        inorderTraversalLoop(treeNode.left, res);
        res.add(treeNode.val);
        inorderTraversalLoop(treeNode.right, res);
    }
```

左 右 **根**------->后序遍历

```java
public List<Integer> postOrderTraversal(BinaryTreeNode root) {
    List<Integer> result = new ArrayList<>();
    postOrderTraversalLoop(root, result);
    return result;
}
private void postOrderTraversalLoop(BinaryTreeNode treeNode, List<Integer> result) {
    if (treeNode == null) {
        return;
    }
    postOrderTraversalLoop(treeNode.left, result);
    postOrderTraversalLoop(treeNode.right, result);
    result.add(treeNode.val);
}
```

### 二叉搜索树

二叉搜索树是一颗空树或者满足下面特点的二叉树

特点:

1. 左子树的所有节点均小于他的根节点
2. 右子树的所有节点均大于他的根节点

**中序遍历二叉搜索树,数据是升序排列**

时间复杂度:平均时间复杂度 插入 删除 查询 是O(lg n)  最坏时间复杂度是O(n)

**删除操作一般将右子树的最小节点替换上来**

## 堆(Heap)

heap:可以找到一堆数中的最大值或者最小值的数据结构. 大顶堆,小顶堆.

时间复杂度:

- 找最大值O(1)

- 删除O(lg n)
- 插入O(lg n) 或者 O(1)

堆根据实现不同分为: 二叉堆,斐波那契堆,2-3堆等等 具体的时间复杂度参考

[heap wike]: https://en.wikipedia.org/wiki/Heap_(data_structure)

其中二叉堆时空复杂度较差,但是其比较容易实现

### 二叉堆

通过**完全二叉树**来实现

性质:

- 是一颗完全二叉树
- 树中任意节点的值总是 >=其子节点的值(大顶堆)

(技巧)使用数组来实现完全二叉树:

1. 数组下标**i的左节**点是`2 * i + 1`
2. 数组下标**i的右节**点是`2 * i + 2`
3. 数组下标**i的父节**点是`(i - 1) / 2`

常见操作:

1. 插入

   先将其放到数组末尾然后进行heapifyUp调整(**与父节点比较交换**)

2. 删除

   先将最后一个节点放到头节点,然后heapifyDown调整(**与子节点最大值比较交换**)


