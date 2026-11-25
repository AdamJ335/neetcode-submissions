class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<String> operations = new ArrayList<>();
        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");

        Stack<Integer> numbers = new Stack<>();

        for (String c : tokens) {
            if (operations.contains(c)) {
                int b = numbers.pop();
                int a = numbers.pop();
            
                switch(c) {
                    case "+":
                        numbers.add(a+b);
                    break;
                    case "-":
                        numbers.add(a-b);
                    break;
                    case "*":
                        numbers.add(a*b);
                    break;
                    case "/":
                        numbers.add(a/b);
                    break;
                }
            }
            else {
                numbers.add(Integer.parseInt(c));
            }
        }
        return numbers.peek();
        
    }
}
