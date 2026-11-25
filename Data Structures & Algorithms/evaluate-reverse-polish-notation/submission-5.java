class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> numbers = new Stack<>();

        for (int i=0; i<tokens.length; i++) {
            String c=tokens[i];
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
