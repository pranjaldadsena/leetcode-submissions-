class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max=0;
        int n=heights.length;
        for(int i=0;i<heights.length;i++){
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
               int popped = stack.pop();
               int h = heights[popped];
               int w = stack.isEmpty() ? i : i - stack.peek() - 1;
               max = Math.max(max, h * w);
            }stack.push(i);
        }
            while (!stack.isEmpty()) {
            int popped = stack.pop();
            int h = heights[popped];
            int w = stack.isEmpty() ? n : n - stack.peek() - 1;
            max = Math.max(max, h * w);
        }
    return max;
    }
}