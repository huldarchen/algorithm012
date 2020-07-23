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
     
     //4. restore current status
   }
   ```

   