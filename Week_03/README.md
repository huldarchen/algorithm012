# 递归(recursion)

## 思维要点

1. 杜绝人肉递归(最大误区)
2. 找到最近最简单方法,将其拆解为重复子问题(重复子问题)
3. 数学归纳法思维

## 递归模板

1. java版

   ```java
   public void recursion(int level, int params) {
     //1.terminator
     if (level > MAX_LEVEL) {
       //process result
       return ;
     }
     //2.process current logic
     process(level, params);
     
     //3.drill down
     recursion(level + 1, params);
     
     //4. reverse current status
   }
   ```

2. python版本

   ```python
   def recursion(level, param1, param2, ...):
   	# recursion terminator
   	if level > MAX_LEVEL:
   		process_result
   		return
   	# process logic in current level
   	process(level, data...)
   	# drill down
   	self.recursion(level + 1, p1, ...)
   	# reverse the current level status if needed
   ```

# 分支

```java
public int divideConquer(Problem problem, int param1, int param2...) {
  // recursion terminator
  if (problem == nullptr) {
    process_result
    return return_result;
  } 

  // process current problem
  subproblems = split_problem(problem, data)
  subresult1 = divide_conquer(subproblem[0], p1)
  subresult2 = divide_conquer(subproblem[1], p1)
  subresult3 = divide_conquer(subproblem[2], p1)
  ...

  // merge
  result = process_result(subresult1, subresult2, subresult3)
  // revert the current level status
 
  return 0;
}
```

# 回溯

```python
result = []
def backtrack(路径, 选择列表):
    if 满足结束条件:
        result.add(路径)
        return
    for 选择 in 选择列表:
        做选择
        backtrack(路径, 选择列表)
        撤销选择
```

