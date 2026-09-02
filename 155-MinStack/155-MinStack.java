// Last updated: 9/2/2026, 1:35:44 PM
1import java.util.*;
2
3class MinStack {
4
5    Stack<Integer> stack;
6    Stack<Integer> minStack;
7
8    public MinStack() {
9        stack = new Stack<>();
10        minStack = new Stack<>();
11    }
12
13    public void push(int value) {
14        stack.push(value);
15
16        if (minStack.isEmpty()) {
17            minStack.push(value);
18        } else {
19            int min = Math.min(value, minStack.peek());
20            minStack.push(min);
21        }
22    }
23
24    public void pop() {
25        stack.pop();
26        minStack.pop();
27    }
28
29    public int top() {
30        return stack.peek();
31    }
32
33    public int getMin() {
34        return minStack.peek();
35    }
36}