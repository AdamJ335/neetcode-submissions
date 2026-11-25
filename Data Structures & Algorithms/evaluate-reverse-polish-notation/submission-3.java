class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> numbers = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+")){
                int b = numbers.pop();
                int a = numbers.pop();
                numbers.push(a+b);
                continue;
            }
            if (c.equals("-")) {
                int b = numbers.pop();
                int a = numbers.pop();
                numbers.push(a-b);
                continue;
            }
            if (c.equals("*")) {
                int b = numbers.pop();
                int a = numbers.pop();
                numbers.push(a*b);
                continue;
            }
            if (c.equals("/")) {
                int b = numbers.pop();
                int a = numbers.pop();
                numbers.push(a/b);
                continue;
            }
            numbers.push(Integer.parseInt(c));
            
        }
        return numbers.pop();
        
    }
}
